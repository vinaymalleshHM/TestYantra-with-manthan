
public class Marker extends Pen
{
	Marker()
	{
		this(2);
		System.out.println("B");
		
	}
	
	Marker(int x)
	{
		//super(x); //here super constructor is there zero parameterrized 
		//compiler will write 
		System.out.println("N");
		
	}
	Marker(double x)
	{
		super(2);
		System.out.println("H");
		
	}

}
