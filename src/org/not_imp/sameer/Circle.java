package org.not_imp.sameer;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;

public class Circle implements Shape, InitializingBean, DisposableBean {

	@Autowired
	@Qualifier("circleRelated")
	private Point centre;

	private int radius;
	
	@Autowired
	private MessageSource messageSource;

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	@Override
	public void draw() {
		System.out.println(messageSource.getMessage("circle.point",new Object [] {"circle", centre.getX(), centre.getY()}, "Default point", null));
		System.out.println("radius is = " + getRadius());
		System.out.println(messageSource.getMessage("circleGreeting",null, "Default Circle greetings", null));
	}

	public int getRadius() {
		return radius;
	}

	//@Required
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("bean destroy method;circle diposable bean destroy method");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("bean init method; circle afterPropertiesSet");

	}

	public Circle(int radius) {
		super();
		this.radius = radius;
		System.out.println("circle constructor here...");
	}

}
