package shanker.assignment.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("databaseFortuneService")
public class DataBaseFortuneService implements FortuneService{

    @Value("${foo.fortune1}")
    String st1;
    @Value("${foo.fortune2}")
    String st2;
    @Value("${foo.fortune3}")
    String st3;


    @Override
    public String getFortune() {
        String[] arr1 = new String[]{st1,st2,st3};
        return arr1[(int)Math.floor(Math.random()*3)];
    }
}
