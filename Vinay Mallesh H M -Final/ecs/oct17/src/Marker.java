
public class Marker extends Pen
{
	Marker()
	{
		this(2);
		System.out.println("B");
		
	}
	
	Marker(int x)
	{
		//super(x);
		System.out.println("N");
		
	}
	Marker(double x)
	{
		super(2);
		System.out.println("N");
		
	}

}
