package shanker.assignment.data;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

    String [] arr = new String[]{"Good Luck Day" , "heavyLuck","NExt Level Lucky"};

    @Override
    public String getFortune() {
        String fortune = arr[(int)Math.floor(Math.random()*3)];
        return fortune;
    }
}
