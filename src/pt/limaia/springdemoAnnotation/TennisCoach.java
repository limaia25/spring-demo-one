package pt.limaia.springdemoAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	private Fortune fortune;

	@Autowired
	public TennisCoach(Fortune fortune) {
		setFortune(fortune);
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhan voley";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getDailyFortune();
	}

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(" Do something cool before start");
	}

	@PreDestroy
	public void myCleanUpStuff() {
		System.out.println("Do something to clean");
	}

	public Fortune getFortune() {
		return fortune;
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}
}
