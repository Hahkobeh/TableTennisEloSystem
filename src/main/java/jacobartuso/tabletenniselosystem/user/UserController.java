package jacobartuso.tabletenniselosystem.user;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {





    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    //move all to service


    @PostMapping("/create")
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    //called after a game is played
    @PutMapping("/{winnerId}/{loserId}")
    public void updateUsers(@PathVariable String winnerId, @PathVariable String loserId) {
        try {
            System.out.println(winnerId + loserId);
            //userService.updateUsers(winnerId,loserId);
        }catch (UserNotFoundException e){
            //TODO add this once ui working
            System.err.println("USER NOT FOUND!");
        }

    }




    @GetMapping("/top")
    public List<User> getPlayerRankings(){
        return userService.getPlayerRankings();
    }

}
