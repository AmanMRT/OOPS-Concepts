package abstraction;

abstract public class Shape 
{
	String color;
	boolean filled;
	public Shape() {
		super();
	}
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public double getArea()
	{
		return 0;
		
	}
	
	public double getPerimeter()
	{
		return 0;
		
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + ", getColor()=" + getColor() + ", isFilled()="
				+ isFilled() + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}
	
}
