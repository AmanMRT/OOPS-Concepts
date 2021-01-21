package abstraction;

public class circle extends Shape
{
	double radius;

	public circle() {
		super();
	}

	public circle(double radius, String color, boolean filled) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea()
	{
		return 3.14*radius*radius;
		
	}
	
	public double getPerimeter()
	{
		return 2*3.14*radius ;
		
	}

	@Override
	public String toString() {
		return "circle [radius=" + radius + ", color=" + color + ", filled=" + filled
				+ ", Area=" + getArea() + ", Perimeter=" + getPerimeter() + "]";
	}
}
