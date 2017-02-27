package easy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadMore {

	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br=new BufferedReader(new FileReader("Practice/Readmore.txt"));
		String line="";
		int length=0;
		while((line=br.readLine())!=null){
			line=line.trim();
			length=line.length();
			if(length<=55){
				System.out.println(line);
			}
			else{
				System.out.println(parseLine(line));
			}
		}
	}

	private static String parseLine(String line){
		String output=line.substring(0,41).trim()+"... <Read More>";
		return output;
	}
}
