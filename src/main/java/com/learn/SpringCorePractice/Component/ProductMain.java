package com.learn.SpringCorePractice.Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(ProductConfig.class);
		
		Product p1 = context.getBean("product",Product.class);
		System.out.println(p1);
	}

}
