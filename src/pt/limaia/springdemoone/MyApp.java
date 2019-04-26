package pt.limaia.springdemoone;

public class MyApp {
	
	public static void main(String[] args) {
		
		Coach theCoach = new TrackCoach(new HappyFortuneService());
System.out.println(theCoach.getDailyWorkout());
		
	}

}
