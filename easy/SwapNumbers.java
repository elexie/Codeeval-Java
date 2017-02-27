package easy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class SwapNumbers {
	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new FileReader("Practice\\swapNumbers.txt"));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(readLines(line));
		}
	}
	
	public static String readLines(String line){
		String[] lineArray=line.split(" ");
		int length=0;
		String temp1="",temp2="";
		for(int x=0;x<lineArray.length;x++){
			length=lineArray[x].length();
			temp1=""+lineArray[x].charAt(0);
			temp2=""+lineArray[x].charAt(length-1);
			lineArray[x]=temp2+lineArray[x].substring(1, length-1)+temp1;
		}
	return java.util.Arrays.toString(lineArray).replaceAll("[\\[\\],\\,]","").trim();	
	}

}
