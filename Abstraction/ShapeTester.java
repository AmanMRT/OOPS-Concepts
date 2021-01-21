package abstraction;

public class ShapeTester 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		circle c = new circle();
		c.setRadius(10);
		c.setColor("red");
		c.setFilled(true);
		
		System.out.println(c);
		
		rectangle r = new rectangle();
		r.setColor("red");
		r.setFilled(true);
		r.setLength(10);
		r.setWidth(10);
		
		System.out.println(r);
		
		square s = new square();
		s.setColor("red");
		s.setFilled(true);
		s.setSide(10);
		
		System.out.println(s);

	}

}
