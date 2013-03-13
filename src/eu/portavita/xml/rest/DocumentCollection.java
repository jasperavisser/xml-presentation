package eu.portavita.xml.rest;

import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;

import eu.portavita.helper.DocumentStore;

@Path(value = "document")
public class DocumentCollection {

	@POST
	@Produces("text/plain")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String createDocument(@FormParam("document") String document) {

		// Write document.
		DocumentStore store = DocumentStore.getInstance();
		int id = store.put(document);

		// Return id.
		return Integer.toString(id);
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
