package cn.utry.ws.service.jdk;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService      //标记为远程服务
public class HelloServiceImpl {
	@WebMethod	//标记为远程服务远程方法
	public String sayHello(String name) {
		
<<<<<<< HEAD
		return name+"南方姑娘，你是否喜欢北方的秋凉";
=======
	
	return name+"南方姑娘，你是否喜欢北方的秋凉2018/9/15  赵雷";
>>>>>>> f0fcc3a01767263bcbf692c0c85fdeeb89f68376
	}
}
