package abstraction;

public class rectangle extends Shape
{
	double width;
	double length;
	public rectangle() {
		super();
	}
	public rectangle(double width, double length, String color, boolean filled) {
		super();
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	public double getArea()
	{
		return length*width;
	}
	public double getPerimeter()
	{
		return 2*(length + width);
	}
	@Override
	public String toString() {
		return "rectangle [width=" + width + ", length=" + length + ", Area=" + getArea() + ", Perimeter=" + getPerimeter() + "]";
	}

}
