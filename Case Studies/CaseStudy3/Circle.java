package CaseStudy3;

public class Circle {
	private double radius;
	private double area;
	private double perimeter;
	Circle(double radius) {
		this.radius=radius;
	}
	//getter
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return area;
	}
	public double getperimeter() {
		return perimeter;
	}
	//setter
	public void setArea(double area) {
		this.area=area;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter=perimeter;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	//areaMethod
	public Circle areaOfCircle(double radius) {
		setArea(Math.pow(getRadius(),2)*Math.PI);
		return this;
		
	}
	//areaMethod
	public Circle periOfCircle(double radius) {
		setPerimeter(2*getRadius()*Math.PI);
		return this;
		
	}

}
