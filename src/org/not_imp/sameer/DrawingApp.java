package org.not_imp.sameer;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
//		// @SuppressWarnings("deprecation")
//		// BeanFactory factory = new XmlBeanFactory(new
//		// FileSystemResource("spring.xml"));
//		// Triangle triangle = (Triangle) factory.getBean("triangle");
//		
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		context.registerShutdownHook();
//		Shape ref_shape = (Shape) context.getBean("circle");
////		System.out.println(ref_shape.getBeanName());
////		
////		ref_shape.createThePoint();
//		
//		ref_shape.draw();
//		
//		if (ref_shape instanceof Triangle){
//			Triangle triangle = (Triangle) ref_shape;
//			System.out.println(triangle.getBeanName());		
////			triangle.createThePoint();
//		}
//		
//		System.out.println(context.getMessage("greeting",null ,"Default greetings", null));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape ref_shape = (Shape) context.getBean("circle");
		ref_shape.draw();
		context.close();
	}

}
