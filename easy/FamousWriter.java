package easy;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class FamousWriter 
{
	public String convertKey(String code, String key)
	{
	 String name="";	

	 String[] key_array=key.split(" ");
	 String[] code_array=code.split("");
		for(int x=0;x<key_array.length;x++)
		{
		name+=code_array[Integer.valueOf(key_array[x])];		
		}
	return name;				
	}

	public String returnName(String s)
	{
	String code=" ";
	code+=s.substring(0,s.indexOf("|"));
	String key=s.substring(s.indexOf("|")+1).trim();
	String name=convertKey(code,key);
	return name;
	}
	public static void main(String[] args) throws IOException
	{	
		
	File f=new File("C:\\Users\\Elexie\\Desktop\\Practice\\famousWriter.txt");
	FamousWriter fw=new FamousWriter();
	ArrayList<String>aList=new ArrayList<>();
	Scanner readFile=new Scanner(f);
	while(readFile.hasNextLine())
	  {
	  String name=fw.returnName(readFile.nextLine());	
	  aList.add(name.trim());
	  }
	readFile.close();	
	
		for(String name : aList)
		{
		System.out.println(name);
		}
	
	}
	
	
	
}
