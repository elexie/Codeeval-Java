package easy;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Selfdescribing 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
	File f=new File("Practice\\selfDescribing.txt");
	Scanner readFile=new Scanner(f);
	
	String lines="";
	while(readFile.hasNextLine())
		{
		lines+=readFile.nextLine()+",";
		}
	Selfdescribing sb=new Selfdescribing();
	String[] split_lines=lines.split(",");
	
	int[] status=sb.readLines(split_lines);
	for(int y=0;y<status.length;y++)
		{
		System.out.println(status[y]);	
		}
	readFile.close();
	}

	
	public int count_occurences(int position,String str)
	{
	int occurences=0;
	for(int x=0;x<str.length();x++)
		{
			if(String.valueOf(str.charAt(x)).compareToIgnoreCase(String.valueOf(position))==0)
			{
			occurences+=1;	
			}
		
		}
		
	return occurences;		
    }
	public int[] readLines(String[] lines)
	{
		
		int[] numbers_status=new int[lines.length];
		
		for(int x=0;x<lines.length;x++/** examine every line*/)
		{

			boolean line_status=false;
			/** a boolean stating if every line is self-describing or not*/
			
		  for(int y=0;y<lines[x].length();y++/** examine the individual numbers */)
		  	{
				
			    int position=y;//get the current position
				int char_at_position=Integer.valueOf(lines[x].substring(y,y+1));
				int occurences=count_occurences(position,lines[x]);	
				if(char_at_position==occurences/**see if position y appears char_at_position 
				times in the string*/)
					{
					line_status=true;	
					}
				else if(position!=occurences)
					{
					line_status=false;
					y=lines[x].length();/**terminate the loop */	
					}
			
		   	}
		  
	   numbers_status[x]=line_status ? 1 : 0;	
	   }
	return numbers_status;
	
	}
	
}
