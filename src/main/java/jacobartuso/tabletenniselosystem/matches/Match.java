package jacobartuso.tabletenniselosystem.matches;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("MatchHistory")
public class Match {
    @Id
    private String id;
    private String winner;
    private String loser;
    private int bestOf;









}
