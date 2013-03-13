package eu.portavita.xml.rest;

import java.io.StringWriter;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import org.apache.commons.lang3.StringUtils;

import eu.portavita.helper.DocumentStore;
import eu.portavita.sample.Document;
import eu.portavita.xml.jaxb.JaxbDemo;

@Path(value = "document")
public class DocumentCollection {

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces("text/plain")
	public String createDocument(@FormParam("document") Document document) {

		// Write document.
		DocumentStore store = DocumentStore.getInstance();
		final StringWriter writer = new StringWriter();
		try {
			JaxbDemo.getMarshaller().marshal(document, writer);
		} catch (JAXBException e) {
			throw new WebApplicationException(500);
		}
		int id = store.put(writer.toString());

		// Return id.
		return RestDemo.URL + "/document/" + Integer.toString(id);
	}

	@GET
	@Produces("text/plain")
	public String getDocuments() {

		// Fetch list.
		DocumentStore store = DocumentStore.getInstance();
		Set<String> ids = store.list();

		// Return ids.
		return StringUtils.join(ids, "\n");
	}
}
