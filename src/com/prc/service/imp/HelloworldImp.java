package com.prc.service.imp;

import com.prc.service.Helloworld;

/**
 * @Description 
 * @author Zengsl
 * @date 2017年2月5日
 * @version V1.0
 */
public class HelloworldImp implements Helloworld {

	@Override
	public void sayHello() throws Exception {
		System.out.println("hello world");
	}

}
