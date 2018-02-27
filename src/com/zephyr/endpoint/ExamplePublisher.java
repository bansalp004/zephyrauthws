package com.zephyr.endpoint;
 
import javax.xml.ws.Endpoint;
import com.zephyr.ws.AuthenticationServiceImpl;
 

//Endpoint publisher
public class ExamplePublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/authenticationService", new AuthenticationServiceImpl());
    }
 
}