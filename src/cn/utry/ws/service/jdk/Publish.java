package cn.utry.ws.service.jdk;

import javax.xml.ws.Endpoint;

/**
 * ��������
 * @author Administrator
 *
 */
public class Publish {
	
	/**
	 * Endpoint-----ʼ�ն˵���˼
	 * address------�����ĵ�ַ
	 *implementor---��������
	 * @param args
	 */
	public static void main(String[] args) {
		
		String address="http://127.0.0.1:6757/hello";
		
		Object implementor=new HelloServiceImpl() ;
				
		Endpoint.publish(address, implementor);//�첽ִ��
		
		System.out.println("���񷢲��ɹ���");
	
	}

}
