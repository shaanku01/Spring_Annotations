package shanker.assignment.data;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Cricket Coach tell you to work hard!!!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
