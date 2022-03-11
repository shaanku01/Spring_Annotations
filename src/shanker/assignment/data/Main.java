package shanker.assignment.data;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Read the Spring Config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from Spring Container

        Coach coach = context.getBean("thatCoach",Coach.class);
        //default bean name:
        Coach coach1  =context.getBean("cricketCoach",Coach.class);

        SwimCoach swimCoach  = context.getBean("swimCoach",SwimCoach.class);

        //Dependency Injection (Constructor Injection)

        System.out.println(coach.getDailyFortune());

        //call a method on the bean

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach1.getDailyWorkout());


        System.out.println(swimCoach.name);
        System.out.println(swimCoach.email);

        //close the context object..
        context.close();
    }
}
