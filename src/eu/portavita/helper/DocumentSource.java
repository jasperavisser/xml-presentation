package eu.portavita.helper;

import java.util.Random;

public class DocumentSource {

	private static Random random = new Random();

//	public static Document produce() {
//
//		Document document = new Document();
//
//		for (int i = 0; i < 100; i++) {
//
//			Observation observation = new Observation();
//			observation.setClassCode(ClassCode.OBS);
//			observation.setMoodCode(MoodCode.EVN);
//			document.getObservations().add(observation);
//
//			Code code = new Code();
//			code.setCode("Portavita" + random.nextInt(1000));
//			code.setDisplayName("Glucose level");
//			observation.setCode(code);
//
//			if (random.nextBoolean()) {
//				PQ pq = new PQ();
//				pq.setValue(new BigDecimal(random.nextFloat()));
//				pq.setUnit("mg");
//				observation.setValue(pq);
//			} else {
//				CD cd = new CD();
//				cd.setCode("Portavita" + random.nextInt(1000));
//				cd.setDisplayName("Average");
//				observation.setValue(cd);
//			}
//		}
//
//		return document;
//	}
}
