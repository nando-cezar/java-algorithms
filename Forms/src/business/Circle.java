package business;

public class Circle extends GeometricForm{
    
    private Point center;
	private double radius;
	
	public Circle(String lineColor, String backgroundColor, Point center, double radius) {

		super(lineColor, backgroundColor);
		this.center = center;
		this.radius = radius;
	}

	public Circle() {
		super();
		this.center = null;
		this.radius = 0;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI* Math.pow(this.getRadius(), 2);
	}
}
