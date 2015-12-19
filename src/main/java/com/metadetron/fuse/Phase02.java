package com.metadetron.fuse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.metadetron.spring.FileBean;

public class Phase02 {
	public static void main(String[] args) {
		System.out.println("It runs :-) and it's phase 5");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		FileBean obj = (FileBean) context.getBean("file");
		System.out.println("Value read: " + obj.getName());
	}
}