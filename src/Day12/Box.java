package Day12;

public class Box 
{
	
	double l,b,h;
	Box ()
	{
		l=0;
		b=0;
		h=0;
	}
	
	Box(double len, double bre, double hei)
	{
		l = len ;
		b = bre ;
		h = hei;
	}
	
	Box(double len)
	{
		l = b = h = len;
	}
	
	double volume()
	{
		return(l*b*h);
	}
	
}
