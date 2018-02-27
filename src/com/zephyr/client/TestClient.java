package com.zephyr.client;
 
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
//import com.mkyong.ws.HelloWorld;
 
public class TestClient{
 
	public static void main(String[] args) throws Exception {
 
		URL url = new URL("http://localhost:9999/ws/authentication?wsdl");
 
        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.zephyr.com/", "AuthenticationImplService");
 
        Service service = Service.create(url, qname);
 
        //HelloWorld hello = service.getPort(HelloWorld.class);
 
       // System.out.println(hello.getHelloWorldAsString("mkyong"));
 
    }
 
}