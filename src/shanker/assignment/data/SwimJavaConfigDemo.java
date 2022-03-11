package shanker.assignment.data;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemo {
    public static void main(String[] args) {

        // Read the Spring Config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from Spring Container

        Coach coach = context.getBean("baseBallCoach",Coach.class);


        System.out.println(coach.getDailyFortune());

        //call a method on the bean

        System.out.println(coach.getDailyWorkout());


        //close the context object..
        context.close(





        );
    }
}
