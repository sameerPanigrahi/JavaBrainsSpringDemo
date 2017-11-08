package org.not_imp.sameer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;

public class Rectangle implements Shape, ApplicationContextAware {

	private int l, b;

	private Diagonal diagonal;

	public Diagonal getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(Diagonal diagonal) {
		this.diagonal = diagonal;
	}

	private ApplicationContext context;

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	@Autowired
	private MessageSource messageSource;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void draw() {
		System.out.println(messageSource.getMessage("draw.sides", new Object[] { getL(), getB() },
				"draw.sides print unsuccessful", null));

		if (diagonal != null) {
			System.out.println(messageSource.getMessage(
					"draw.diagonal", new Object[] { getDiagonal().getD1().getX(), getDiagonal().getD1().getY(),
							getDiagonal().getD2().getX(), getDiagonal().getD2().getY() },
					"draw.diagonal print unsuccessful", null));
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		setContext(context);

	}
}
