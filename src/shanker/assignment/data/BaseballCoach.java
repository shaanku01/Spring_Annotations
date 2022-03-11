package shanker.assignment.data;

import org.springframework.beans.factory.annotation.Value;

public class BaseballCoach implements Coach{


    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.name}")
    private String name;
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;


    }
    @Override
    public String getDailyWorkout() {
        System.out.println(name+" "+email);
        return "Do 100 batting as warmup";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
