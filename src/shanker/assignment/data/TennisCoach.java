package shanker.assignment.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("thatCoach")
@Scope("singleton")
public class TennisCoach implements Coach {


    public TennisCoach(){

    }


    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneService fortuneService;

    // Setter Injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }



// Constructor Injection
//    @Autowired
//    public TennisCoach(FortuneService fortuneService){
//        this.fortuneService =fortuneService;
//    }

    //Define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("Start up Stuff");
    }

    //Define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Clean up Stuff");
    }


    @Override
    public String getDailyWorkout() {
        return "Sweat more in Training to bleed less in War";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
