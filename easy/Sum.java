package easy;

import java.util.Scanner;
import java.io.*;
/**
 * https://www.codeeval.com/open_challenges/24/
 * @author Elexie
 *
 */

public class Sum {
    public static void main (String[] args) throws IOException 
    {
    	System.out.println("file name : ");
    	Scanner getFileName=new Scanner(System.in);
    	String fileName=getFileName.nextLine();
        File file = new File("Practice//"+fileName+".txt");
        Scanner readFile = new Scanner(file);
        String line="";
        Sum s=new Sum();
        while (readFile.hasNextLine()) 
        {
        line = readFile.nextLine().trim();
        String getLine=line;
        s.getLines(getLine);
        }
        readFile.close();
        getFileName.close();
    }


    public void getLines(String line_)
    {
    String getLine=line_;
    String[] split=getLine.split("");
    returnSum(split);
    }
    
    public int returnSum(String[] split)
    {
    int splitLength=split.length;    
    int sum=0;
        for(int y=0; y<splitLength; y++)
        {
        sum+=Integer.parseInt(split[y]);  
        }
    print(sum);    
    return sum;    
    }
    
    public void print(int sum_)
    {
    System.out.println(sum_);
    }
    
}    