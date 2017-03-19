package evolution.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class AnyWebService {
	@WebMethod
    public String sayHello(String name) {
        return name;
    }
}
