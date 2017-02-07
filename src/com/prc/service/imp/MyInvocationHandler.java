package com.prc.service.imp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Zengsl
 * @date 2017年2月5日
 * @version V1.0
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("method:" + method.getName() + " is invoked");
		return method.invoke(target, args);
	}

}
