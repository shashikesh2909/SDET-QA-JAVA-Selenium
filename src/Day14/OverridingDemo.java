package Day14;

class vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

class bike extends vehicle
{
	void run()
	{
		System.out.println("bike is running");
	}
}

class car extends vehicle
{
	void run()
	{
		System.out.println("car is running");
	}
}



public class OverridingDemo {

	public static void main(String[] args) 
	{
		bike b = new bike();
		vehicle v = new vehicle();
		car c = new car();
		
		v.run();
		
	}

}
