package pt.limaia.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		//load spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		//retrieve spring bean from the container
		Coach thecoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (thecoach==alphaCoach);
		
		System.out.println(result);
		System.out.println("Memory in TheCoach: "+thecoach);
		System.out.println("Memory in TheAlfaCoach: "+alphaCoach);
		
		//close context
		context.close();

	}

}
