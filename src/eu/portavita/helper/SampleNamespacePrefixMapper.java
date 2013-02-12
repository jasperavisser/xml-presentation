package eu.portavita.helper;

import org.eclipse.persistence.oxm.NamespacePrefixMapper;

public class SampleNamespacePrefixMapper extends NamespacePrefixMapper {

	@Override
	public String[] getPreDeclaredNamespaceUris() {
		return new String[] { "http://www.w3.org/2001/XMLSchema-instance" };
	}

	@Override
	public String getPreferredPrefix(String uri, String suggestion, boolean requirePrefix) {
		if (uri.equals("http://www.w3.org/2001/XMLSchema-instance")) {
			return "xsi";
		}
		return suggestion;

	}
}