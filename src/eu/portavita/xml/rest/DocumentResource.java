package eu.portavita.xml.rest;

import java.io.StringReader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.xml.bind.JAXBException;

import eu.portavita.helper.DocumentStore;
import eu.portavita.sample.Document;
import eu.portavita.xml.jaxb.JaxbDemo;

@Path(value = "document/{id}")
public class DocumentResource {

	@GET
	@Produces("application/json")
	public Document getDocument(@PathParam("id") Integer id) throws JAXBException {

		// Fetch document.
		DocumentStore store = DocumentStore.getInstance();
		String document = store.get(id);

		// If not found, return 404.
		if (document == null) {
			throw new WebApplicationException(404);
		}

		// Return document.
		return (Document) JaxbDemo.getUnmarshaller().unmarshal(new StringReader(document));
	}
}
