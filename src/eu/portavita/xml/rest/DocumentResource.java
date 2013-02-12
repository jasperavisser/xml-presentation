package eu.portavita.xml.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;

import eu.portavita.helper.DocumentStore;

@Path(value = "document/{id}")
public class DocumentResource {

	@GET
	@Produces("text/plain")
	public String getDocument(@PathParam("id") Integer id) {

		// Fetch document.
		String document = DocumentStore.getInstance().get(id);

		// If not found, return 404.
		if (document == null) {
			throw new WebApplicationException(404);
		}

		// Return document.
		return document;
	}
}
