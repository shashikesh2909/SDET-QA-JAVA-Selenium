package Day12;

import java.util.Arrays;
import java.util.Scanner;

public class Rectangle_main {

	public static void main(String[] args) 
	{
		double rect [][] = new double[3][2];
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter length and breadth of rectangle 1");
		
		for (int i = 0;i<3;i++)
		{
			for (int j =0;j<2;j++)
			{
				rect[i][j] = sc.nextDouble();
			}
			if(i==2)
			{
				break;
			}
			System.out.println(" Enter length and breadth of rectangle "+(i+2));
		}	
		System.out.println(Arrays.deepToString(rect));
		/*
		Rectangle_Assign ra = new Rectangle_Assign(rect[0][0], rect[0][1]);
		System.out.println(ra.getArea());
		System.out.println(ra.getPerimeter());

		
		Rectangle_Assign ra1 = new Rectangle_Assign(rect[1][0], rect[1][1]);
		System.out.println(ra1.getArea());
		System.out.println(ra1.getPerimeter());
		
		Rectangle_Assign ra2 = new Rectangle_Assign(rect[2][0], rect[2][1]);
		System.out.println(ra2.getArea());
		System.out.println(ra2.getPerimeter());
		*/
		Rectangle_Assign as = new Rectangle_Assign();
		as.setHeight(rect[0][0]);
		as.setWidth(rect[0][1]);
		
		System.out.println(as.getArea());
}
}
