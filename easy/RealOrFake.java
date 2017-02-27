package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RealOrFake {

	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new FileReader("Practice\\realOrFake.txt"));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(validateNum(line));
		}

	}

	private static String validateNum(String num){
		String[] numArray=num.replaceAll(" ","").trim().split("");
		//^removes all spaces from the card number and converts it to 
		//an array
		int sum=0;
		for(int x=0;x<numArray.length;x++){
			if(x==0 || x==2 || x==4 || x==6 || x==8 || x==10
					||x==12 || x==14){
			sum+=2*Integer.parseInt(numArray[x]);	
			}
			else{
				sum+=Integer.parseInt(numArray[x]);	
			}
		}
		boolean output=sum%10==0;
		return output?"Real":"Fake";
	}
}
