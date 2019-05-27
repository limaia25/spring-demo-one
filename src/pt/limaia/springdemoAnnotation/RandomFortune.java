package pt.limaia.springdemoAnnotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements Fortune {

	@Override
	public String getDailyFortune() {
		return "Random Fortune new Fortune";
	}

}
