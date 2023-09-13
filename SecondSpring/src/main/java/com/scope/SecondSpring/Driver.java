package com.scope.SecondSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("vehicle.xml");
		Car c1 =c.getBean("car", Car.class);
		System.out.println(c1.hashCode());
		
		Car c2 = c.getBean("car", Car.class);
		System.out.println(c2.hashCode());
		
		Car c3  = c.getBean("car", Car.class);
		c3.drive();
	}

}
