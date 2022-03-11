package shanker.assignment.data;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AssignmentMain {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AssignmentConfig.class);
        Coach obj = context.getBean("soccerCoach",Coach.class);

        System.out.println(obj.getDailyFortune());

        context.close();

    }
}
