package com.app1;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestQuery {

	public static void main(String[] args)
	{
		String url="http://localhost:8070/ProviderEx/rest/query/msg";
		Client c=Client.create();
		WebResource wr=c.resource(url);
		wr=wr.queryParam("ename","ZXC" );
		wr=wr.queryParam("eid","100" );
		wr=wr.queryParam("esal","3.2" );
		ClientResponse cr=wr.get(ClientResponse.class);
		String s=cr.getEntity(String.class);
       System.out.println(s);		 
		
		
		

	}

}
