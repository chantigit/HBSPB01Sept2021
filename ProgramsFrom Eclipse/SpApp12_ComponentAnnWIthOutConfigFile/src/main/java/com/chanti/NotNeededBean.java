package com.chanti;

import org.springframework.stereotype.Component;

@Component
public class NotNeededBean {

	public NotNeededBean() {
		System.out.println("NotNeededBean.NotNeededBean()");
	}
	
}
