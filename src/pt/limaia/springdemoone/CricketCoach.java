package pt.limaia.springdemoone;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	

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
		System.out.println("[CricketCoach]:Inside set Fortune");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("[CricketCoach]:Inside set Email");

		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
}
