package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestClient {

	public static void main(String[] args) 
	{
		String url="http://localhost:2017/provider/rest/home/msg";
		Client c=Client.create();
		WebResource wr=c.resource(url);
		wr=wr.queryParam("ename", "Abc");
		wr=wr.queryParam("esal","3.2" );
		wr=wr.queryParam("eid","123");
		ClientResponse cr=wr.get(ClientResponse.class);
		String s=cr.getEntity(String.class);
		System.out.println(s);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		
		
		
		
		

	}

}
