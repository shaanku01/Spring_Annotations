package shanker.assignment.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
//@ComponentScan("shanker.assignment.data")
@PropertySource("classpath:sports.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach baseBallCoach(){
        return new BaseballCoach(sadFortuneService());
    }



}
