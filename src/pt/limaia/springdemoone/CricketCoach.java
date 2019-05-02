package pt.limaia.springdemoone;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public CricketCoach() {
		System.out.println("Create Cricket with no arguments");
	}

	@Override
	public String getDailyWorkout() {
		return "Pratice fast bowling for 50 min";
	}

	@Override
	public String getDailyFortune() {
		return getFortuneService().getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside set Fortune");
		this.fortuneService = fortuneService;
	}

	
}
