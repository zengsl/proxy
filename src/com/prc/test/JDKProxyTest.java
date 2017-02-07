package com.prc.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.prc.service.Helloworld;
import com.prc.service.imp.HelloworldImp;
import com.prc.service.imp.MyInvocationHandler;

/**
 * @Description
 * @author Zengsl
 * @date 2017年2月5日
 * @version V1.0
 */
public class JDKProxyTest {
	public static void main(String[] args) throws Exception {
		Class<?> proxyClass = Proxy.getProxyClass(JDKProxyTest.class.getClassLoader(), Helloworld.class);
		final Constructor<?> cons = proxyClass.getConstructor(InvocationHandler.class);
		final InvocationHandler ih = new MyInvocationHandler(new HelloworldImp());
		Helloworld helloWorld = (Helloworld) cons.newInstance(ih);
		helloWorld.sayHello();
		
		/*Helloworld helloWorld2 = (Helloworld) Proxy.newProxyInstance(JDKProxyTest.class.getClassLoader(),
				new Class<?>[] { Helloworld.class }, new MyInvocationHandler(new HelloworldImp()));
		helloWorld2.sayHello();*/
	}
}
