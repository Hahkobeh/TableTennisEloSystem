package jacobartuso.tabletenniselosystem.matches;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/match")
@CrossOrigin(origins = "http://localhost:3000")
public class MatchController {

}
