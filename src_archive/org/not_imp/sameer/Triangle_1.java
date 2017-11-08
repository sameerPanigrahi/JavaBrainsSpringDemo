package org.not_imp.sameer;

public class Triangle_1 {

	private String type;
	private int sides;
	private int height;
	private String base;

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public Triangle_1(int sides) {
		this.setSides(sides);
	}

	public Triangle_1(int sides, int height) {
		this.setSides(sides);
		this.setHeight(height);
	}
	
	public Triangle_1(int sides, String base) {
		this.setSides(sides);
		this.setBase(base);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println("triangle drawn");
	}
}
