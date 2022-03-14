package jacobartuso.tabletenniselosystem.matches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/match")
@CrossOrigin(origins = "http://localhost:3000")
public class MatchController {

    private final MatchService matchService;

    @Autowired
    MatchController(MatchService matchService){
        this.matchService = matchService;
    }

}
