package easy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FibonacciSeries {

	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new FileReader("Practice\\fib.txt"));
		int sum=0;
		String line="";
		while((line=br.readLine())!=null){
			sum=fib(Integer.parseInt(line.trim()));
			System.out.println(sum);
		}
	
	}
	
	static int fib(int n){
		int ans=0;
		if(n<=0){
			if(n==0)
			{
			ans=0;	
			}
			else{
				ans=1;
			}
		}
	
		else{
			ans=fib(n-2)+fib(n-1);
		}
	return ans;
	}
}
