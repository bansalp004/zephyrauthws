package com.zephyr.ws;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "com.zephyr.ws.AuthenticationService")
public class AuthenticationServiceImpl implements AuthenticationService{
 
	@Override
	public boolean Authenticate(String userName, String password) {
		return true;
	}
 
}