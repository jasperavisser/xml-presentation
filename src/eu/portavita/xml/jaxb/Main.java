package eu.portavita.xml.jaxb;

import javax.xml.bind.JAXBException;

public class Main {

	public static void main(String[] args) throws JAXBException {

		/**
		 * Unmarshal a file.
		 * (extract unmarshal method)
		 * (re-use unmarshaller)
		 */



		/**
		 * Marshal a clinical document.
		 * (extract marshal method)
		 * (re-use marshaller)
		 *
		 * marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new SampleNamespacePrefixMapper());
		 * marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 */



		/**
		 * Marshal many clinical documents.
		 */
//		Date started = new Date();
//		for (int i = 0; i < 10 * 1000; i++) {
//		}
//		System.out.println((new Date().getTime() - started.getTime()) + "ms");
	}
}
