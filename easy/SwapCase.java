package easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Elexie
 * Write a program which 
 * swaps letters' case in
 * a sentence. All non-letter 
 * characters should remain
 * the same.

Input Sample: 
Hello world!
JavaScript language 1.8
A letter

Output Sample:
hELLO WORLD!
jAVAsCRIPT LANGUAGE 1.8
a LETTER
 *
 */
public class SwapCase {

	public static void main(String[] args) throws IOException, FileNotFoundException 
	{
		
		Scanner s=new Scanner(new File("Practice\\SwapCase.txt"));
		SwapCase sc=new SwapCase();
		while(s.hasNextLine())
		{
		System.out.println(sc.readLines(s.nextLine()));	
		}
		s.close();
	}
	public String readLines(String line)
	{
		int x=0;
		int lineLength=line.length();
		String newString="";
		while(x<lineLength)
		{
		char c=line.charAt(x);
		boolean isLetter=Character.isLetter(c);
		newString+=isLetter?changeCase(c):c;
		x++;
		}
	return newString;
	}
	
	public String changeCase(char s)
	{
	boolean isLowerCase=Character.isLowerCase(s);	
	return isLowerCase?String.valueOf(s).toUpperCase()
			:String.valueOf(s).toLowerCase();	
	}


}
