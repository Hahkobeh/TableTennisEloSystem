package jacobartuso.tabletenniselosystem.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.lang.Math.pow;
import static java.lang.Math.round;

@Service
public class UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void createUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

    public void changeUserRating(String id, int newRating){
        Optional<User> optUser = userRepository.findById(id);
        if(optUser.isEmpty()){
            throw new UserNotFoundException("User not found!");
        }else{
            User user = optUser.get();
            user.setRating(newRating);
            userRepository.save(user);
        }
    }


    public void updateUsers(String winnerId, String loserId) throws UserNotFoundException {
        Optional<User> winner = userRepository.findById(winnerId);
        Optional<User> loser = userRepository.findById(loserId);
        if(winner.isEmpty() || loser.isEmpty()){
            throw new UserNotFoundException("User not found!");
        }else{
            updateElo(winner.get(),loser.get());
        }
    }

    private void updateElo(User winner, User loser){
        int winnerRating = winner.getRating();
        int loserRating = loser.getRating();
        double change;

        double difference = loserRating - winnerRating;
        //chance that winner wins
        double predictedOutcome = 1 / ( 1 + pow(10,(difference)/400));
        change = 32*(1 - predictedOutcome);
        change = round(change);

        changeUserRating(winner.getId(), winnerRating + (int)change);
        changeUserRating(loser.getId(), loserRating - (int)change);




    }

    public List<User> getPlayerRankings(){
        List<User> userList = userRepository.findAll();
        userList.sort(Comparator.comparingInt(User::getRating));
        return userList;
    }




}
