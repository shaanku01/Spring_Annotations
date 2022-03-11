package shanker.assignment.data;

public class SoccerCoach implements Coach{

    private FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
