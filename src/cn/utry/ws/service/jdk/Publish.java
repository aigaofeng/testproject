package cn.utry.ws.service.jdk;

import javax.xml.ws.Endpoint;

/**
 * 发布服务
 * @author Administrator
 *
 */
public class Publish {
	
	/**
	 * Endpoint-----始终端的意思
	 * address------发布的地址
	 *implementor---发布服务
	 * @param args
	 */
	public static void main(String[] args) {
		
		String address="http://127.0.0.1:6757/hello";
		
		Object implementor=new HelloServiceImpl() ;
				
		Endpoint.publish(address, implementor);//异步执行
		
		System.out.println("服务发布成功了");
	
	}

}
