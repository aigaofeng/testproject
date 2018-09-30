package cn.utry.ws.service.jdk;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService      //标记为远程服务
public class HelloServiceImpl {
	@WebMethod	//标记为远程服务远程方法
	public String sayHello(String name) {
		

	return name+"明天就是国庆节了，住大家节日快乐";
	}
}
