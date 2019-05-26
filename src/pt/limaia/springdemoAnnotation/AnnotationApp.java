package pt.limaia.springdemoAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		// load context file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContextAnnotations.xml");
		// retrieve beans
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		// call methods from beans
		System.out.println(myCoach.getDailyWorkout());

		System.out.println(myCoach.getDailyFortune());

		// close context
		context.close();

	}

}
