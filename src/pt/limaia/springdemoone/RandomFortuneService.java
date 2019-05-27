package pt.limaia.springdemoone;

import java.util.ArrayList;
import java.util.List;

public class RandomFortuneService implements FortuneService {
	
	private List<String> fortuneList = new ArrayList<>();

	@Override
	public String getFortune() {
		System.out.println("inside get Fortune:Random");
		 double numRandomBetWeen3 = Math.random()*3;
		return fortuneList.get((int)numRandomBetWeen3);
	}

	public List<String> getFortuneList() {
		return fortuneList;
	}

	public void setFortuneList(List<String> fortuneList) {
		this.fortuneList = fortuneList;
	}
	
	
	
	

}
