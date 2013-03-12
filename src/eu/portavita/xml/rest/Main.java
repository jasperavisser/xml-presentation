package eu.portavita.xml.rest;

import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class Main {

	public static final String URL = "http://localhost:7777/";

	public static void main(String[] args) throws IllegalArgumentException, IOException {

		/**
		 * Start HTTP server.
		 */
		HttpServer server = HttpServerFactory.create(URL);
		server.start();
	}
}
