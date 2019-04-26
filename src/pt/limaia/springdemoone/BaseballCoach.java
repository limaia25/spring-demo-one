package pt.limaia.springdemoone;

public class BaseballCoach implements Coach{
	
	//define private field
	private FortuneService fortuneService;
	
	//define constructor
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 min";
	}

	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
