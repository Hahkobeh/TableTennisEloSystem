package jacobartuso.tabletenniselosystem;

import jacobartuso.tabletenniselosystem.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class TableTennisEloSystemApplication {



    public static void main(String[] args) {
        SpringApplication.run(TableTennisEloSystemApplication.class, args);
    }


    
}
