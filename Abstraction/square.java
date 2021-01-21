package abstraction;

public class square extends rectangle
{
	double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void setWidth(double side) {
		this.side = side;
	}
	public void setLength(double side) {
		this.side = side;
	}

	public square() {
		super();
	}

	public square(double side, String color, boolean filled) {
		super();
		this.side = side;
	}
	
	public double getArea()
	{
		return side*side;
	}
	public double getPerimeter()
	{
		return 4*side;
	}

	@Override
	public String toString() {
		return "square [side=" + side + ", getSide()=" + getSide() + ", Area=" + getArea() + ", Perimeter="
				+ getPerimeter() + "]";
	}
	
	
}
