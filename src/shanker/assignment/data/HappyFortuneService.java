package shanker.assignment.data;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Good Luck Day!";
    }
}
