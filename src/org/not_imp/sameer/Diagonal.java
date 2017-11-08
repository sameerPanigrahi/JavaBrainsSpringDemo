package org.not_imp.sameer;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Diagonal {

	@Autowired
	@Qualifier("DiagonalPoint1")
	private Point D1;
	
	@Autowired
	@Qualifier("DiagonalPoint2")
	private Point D2;

	public Point getD1() {
		return D1;
	}
	public void setD1(Point d1) {
		D1 = d1;
	}

	public Point getD2() {
		return D2;
	}
	public void setD2(Point d2) {
		D2 = d2;
	}
}
