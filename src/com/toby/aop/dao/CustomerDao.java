package com.toby.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDao {
	public void addAccount() {
		System.out.println("add Account");
	}
	
	public void getCustomer() {
		System.out.println("get Customer");
	}
	
	public void setCustomer() {
		System.out.println("set Customer");
	}
}
