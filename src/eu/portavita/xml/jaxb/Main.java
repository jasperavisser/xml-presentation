package eu.portavita.xml.jaxb;

import java.io.File;

import javax.xml.bind.JAXBException;

public class Main {

	public static void main(String[] args) throws JAXBException {

		/**
		 * Unmarshal a file.
		 * (extract unmarshal method)
		 * (re-use unmarshaller)
		 */
		File file = new File("sample.xml");


		/**
		 * Dump document to console.
		 */
//		for (Observation observation : document.getObservations()) {
//			String text = observation.getCode().getDisplayName() + ": ";
//			Value value = observation.getValue();
//			if (value instanceof CD) {
//				CD cd = (CD) value;
//				text += cd.getDisplayName();
//			} else if (value instanceof PQ) {
//				PQ pq = (PQ) value;
//				text += pq.getValue() + pq.getUnit();
//			}
//			System.out.println(text);
//		}


		/**
		 * Marshal a clinical document.
		 * (extract marshal method)
		 * (re-use marshaller)
		 */
//		Document document = DocumentSource.produce();


		/**
		 * Marshal many clinical documents.
		 */
//		Date started = new Date();
//		for (int i = 0; i < 10 * 1000; i++) {
//			getMarshaller.marshal(DocumentSource.produce());
//		}
//		System.out.println((new Date().getTime() - started.getTime()) + "ms");
	}





//	/**
//	 * Marshaller of documents.
//	 */
//	private static Marshaller marshaller = null;
//
//	/**
//	 * Returns the marshaller of documents.
//	 *
//	 * @return
//	 *
//	 * @throws JAXBException
//	 */
//	private static Marshaller getMarshaller() throws JAXBException {
//		if (marshaller == null) {
//			JAXBContext context = JAXBContext.newInstance(Document.class);
//			marshaller = context.createMarshaller();
//			marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new SampleNamespacePrefixMapper());
//			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//		}
//		return marshaller;
//	}
//
//	/**
//	 * Unmarshaller of documents.
//	 */
//	private static Unmarshaller unmarshaller = null;
//
//	/**
//	 * Returns the unmarshaller of documents.
//	 *
//	 * @return
//	 *
//	 * @throws JAXBException
//	 */
//	private static Unmarshaller getUnmarshaller() throws JAXBException {
//		if (unmarshaller == null) {
//			JAXBContext context = JAXBContext.newInstance(Document.class);
//			unmarshaller = context.createUnmarshaller();
//		}
//		return unmarshaller;
//	}
}
