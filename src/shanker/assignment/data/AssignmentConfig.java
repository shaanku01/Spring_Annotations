package shanker.assignment.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AssignmentConfig {

    @Bean
    public FortuneService happyFortune(){return new HappyFortune();}

    @Bean
    public Coach soccerCoach(){return new SoccerCoach(happyFortune());}
}
