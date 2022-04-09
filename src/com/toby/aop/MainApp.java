package com.toby.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.toby.aop.dao.*;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		AccountDao accountDao = context.getBean("accountDao",AccountDao.class);
		accountDao.addAccount();
		accountDao.addAccount2(null);
		accountDao.getAccount();
		accountDao.setAccount();
		CustomerDao customerDao = context.getBean("customerDao",CustomerDao.class);
		customerDao.addAccount();
		customerDao.getCustomer();
		customerDao.setCustomer();
		context.close();
	}

}
