package com.rest.app;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.json.JsonArray;

public class RestApp {
	public static void main(String...a)
	{
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Generation45Rest/Customer");
		JsonArray response = target.request(MediaType.APPLICATION_JSON).get(JsonArray.class);
		
		System.out.println(response);
	}
}
