package org.not_imp.sameer;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, Shape, InitializingBean, DisposableBean {

	private List<Point> points;
	private String beanName;
	private ApplicationContext contextObj;

	public ApplicationContext getContextObj() {
		return contextObj;
	}

	private Point thePoint;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public Point getThePoint() {
		return thePoint;
	}

	public void assignThePoint() {
		this.thePoint = (Point) contextObj.getBean("randomPoint");
	}

	public void draw() {

		if (points != null) {
			for (Point point : points) {
				System.out.println("Point is = (" + point.getX() + ", " + point.getY() + ")");
			}
		} else {
			System.out.println("well, no points :(");
		}
		if (thePoint != null) {
			System.out.println("and the \"The Point\" is (" + thePoint.getX() + ", " + thePoint.getY() + ")");
		}
	}

	public Triangle(List<Point> points_args) {
		System.out.println("now in the triangle constructor...");
		setPoints(points_args);
	}

	public Triangle() {
	}

	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
	}

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.contextObj = arg0;
		System.out.println("the contextObj in Triangle class is " + contextObj.toString());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("triangle afterPropertiesSet");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("triangle diposable bean destroy method");

	}
}
