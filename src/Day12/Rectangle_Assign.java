package Day12;

public class Rectangle_Assign 
{
	private double  width ;
	private double height;
	
	/*
	Rectangle_Assign()
	{
		width = height = 1.0;
	}
	
	Rectangle_Assign(double x, double y)
	{
		this.width = x;
		this.height = y;
	}
	*/
	double getArea()
	{
		return(width*height);
	}
	
	double getPerimeter()
	{
		return (2*(width + height));
	}
	
	public void setWidth(double width) 
	{
		this.width = width;
	}
	

	public double getWidth() 
	{
		return width;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getHeight() 
	{
		return height;
	}
	
	
	

}
