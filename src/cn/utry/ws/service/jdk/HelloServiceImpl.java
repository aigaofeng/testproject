package cn.utry.ws.service.jdk;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService      //���ΪԶ�̷���
public class HelloServiceImpl {
	@WebMethod	//���ΪԶ�̷���Զ�̷���
	public String sayHello(String name) {
		

	return name+"������ǹ�����ˣ�ס��ҽ��տ���";
	}
}
