package easy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Multiples 
{

	
	public static void main(String[]args) throws IOException
	{
	Scanner myScanner=new Scanner(new 
			File("Practice\\multiples.txt"));
	int[] x_y=new int[2];	
	Multiples m=new Multiples();
	while(myScanner.hasNextLine())
		{
		String lines=myScanner.nextLine();
		String[] split=lines.split(",");
		int x=x_y[0]=Integer.valueOf(split[0]);//x
		int y=x_y[1]=Integer.valueOf(split[1]);//y(or n)
		m.get_XY(x,y);
		}
	myScanner.close();
		
	}


	public void get_XY(int x, int y)
	{
		int finalMultiple=0;
	//get multiples of y until the multiple is =>x
	
		int getX=x;
		int getY=y;
		
		if(y==x || y>x)
		{
		finalMultiple=y;
		}
		
		
		if(y<x)
	   {
			
		//garner the multiples of y until it is greater than or equal to x
		while(y<x)
		{
			
		 y+=getY;
		 if(y>=x)
			{
			finalMultiple=y;
			}
		
		}
		
	 }
	//pass the new variable to the finalMultiple() method for printing	
	finalMultiple(finalMultiple);	
	 }	
		
	
	
	private void finalMultiple(int greatestMultiple)
	{	
	System.out.println(greatestMultiple);	
	}
	
	
}
