package proxy_pattern;

import proxy_pattern.proxy.RealSubjectProxy;

public class ProxyStarter {

	public static void main(String[] args) {
		RealSubjectProxy rsp = new RealSubjectProxy("helo man");
		
		System.out.println(Integer.toString(rsp.getNumber()));
		rsp.request();
		System.out.println(Integer.toString(rsp.getNumber()));
		
	}

}
