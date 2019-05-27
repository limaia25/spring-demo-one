package pt.limaia.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//load Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve the bean
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call the methods
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getTeam());
		System.out.println(coach.getEmailAddress());

		//close the context
		context.close();
	}

}
