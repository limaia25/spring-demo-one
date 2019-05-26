package pt.limaia.springdemoAnnotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortune {

	String fortune = "Happy fortune";

//	@PostConstruct
//	public void getFortuneFromFile() {
//		File fr = new File("./fortune.txt");
//
//		BufferedReader br;
//		try {
//			br = new BufferedReader(new FileReader(fr));
//
//			String st = br.readLine();
//			if (st != null)
//				fortune = st;
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//	}

	@Override
	public String getDailyFortune() {
		return fortune;
	}

}
