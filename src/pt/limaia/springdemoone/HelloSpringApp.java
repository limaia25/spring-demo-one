package pt.limaia.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load context file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve beans
		Coach myCoach = context.getBean("myCoach", Coach.class);
		// call methods from beans
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());

		// close context
		context.close();
	}

}
