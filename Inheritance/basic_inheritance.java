package inheritance;

class X
{
    X()
    {
        System.out.println("X consructor");
    }
    X(int a)
    {
        System.out.println("X consructor  "+ a);
    }
}
class Y extends X
{
    Y()
    {
        this(1);
        System.out.println("Y consructor");
    }
    Y(int b)
    {
        super(1000);
        System.out.println("Y consructor  "+ b);
    }
    
}
class Z extends Y
{
    Z()
    {
        System.out.println("Z consructor");
    }
    Z(int c)
    {
    	super(100);
        System.out.println("Z consructor  "+c);
    }
}
public class basic_inheritance 
{
	public static void main( String[] args) 
    {
      Z z=new Z();
      	
    }
}
