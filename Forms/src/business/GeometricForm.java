package business;

public abstract class GeometricForm {
    
    private String lineColor;
	private String backgroundColor;
	
	protected GeometricForm() {
		this.lineColor ="";
		this.backgroundColor ="";
	}
	
	protected GeometricForm(String lineColor, String backgroundColor) {
		this.lineColor = lineColor;
		this.backgroundColor = backgroundColor;
	}
	
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}
    
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	
	public abstract double getArea();
	
	public String getNome() {
		return this.getClass().getName();
	}
}
