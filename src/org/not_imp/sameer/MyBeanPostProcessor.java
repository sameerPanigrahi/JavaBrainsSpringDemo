package org.not_imp.sameer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

//		if (beanName.equals("randomPoint")) {
//			System.out.println("dude! this is the \"The Point\" PP after initialization");
//		}
		if (beanName.equals("triangle")) {
			Point p;
			ApplicationContext contextObj = ((Triangle) bean).getContextObj();
			List<Point> points = new ArrayList<Point>();
			((Triangle) bean).setPoints(points);
			p = (Point) contextObj.getBean("zeroPoint");
			points.add(p);
			p = (Point) contextObj.getBean("point2");
			points.add(p);
			p = (Point) contextObj.getBean("point3");
			points.add(p);
			((Triangle) bean).setPoints(points);
		} else if(beanName.equals("circle")){
			System.out.println("This is PP after initialization of the " + beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		if (beanName.equals("randomPoint")) {
//			System.out.println("dude! this is the \"The Point\" PP after initialization");
//		}
		if (beanName.equals("circle")) {
			System.out.println("This is PP before initialization of the " + beanName);
		}
		return bean;
	}

}
