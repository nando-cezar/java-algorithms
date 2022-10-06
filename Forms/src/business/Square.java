package business;

public class Square extends GeometricForm{
    
    private Point vertex1;
	private Point vertex2;
	
	public Square() {
		super();
	}
	
	public Square(String lineColor, String backgroundColor, Point vertex1, Point vertex2) {
		super(lineColor, backgroundColor);
		this.vertex1=vertex1;
		this.vertex2=vertex2;
		
	}
	
	public Point getVertex1() {
		return vertex1;
	}

	public void setVertex1(Point vertex1) {
		this.vertex1 = vertex1;
	}

	public Point getVertex2() {
		return vertex2;
	}

	public void setVertex2(Point vertex2) {
		this.vertex2 = vertex2;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(vertex1.getDistance(vertex2), 2);
	}
}
