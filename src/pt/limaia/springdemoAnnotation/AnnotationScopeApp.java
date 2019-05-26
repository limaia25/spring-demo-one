package pt.limaia.springdemoAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeApp {

	public static void main(String[] args) {
		//load spring file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		
		//retrieve bean from spring container
		Coach myCoach = context.getBean("tennisCoach", Coach.class);

		Coach myCoachAlpha = context.getBean("tennisCoach", Coach.class);

		//check if is the same
		boolean result = myCoach==myCoachAlpha;
		System.out.println("result is:"+result);
		
		//close the context
		context.close();
	}
}
