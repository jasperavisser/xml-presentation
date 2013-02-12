package eu.portavita.xml.rest;

import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;

public class Main {

	public static final String URL = "http://localhost:7777/";

	public static void main(String[] args) throws IllegalArgumentException, IOException {
		HttpServerFactory.create(URL).start();
	}
}
