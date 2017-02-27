package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NotSoClever {
	static int limit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Practice\\NotSoClever.txt"));
		String line = "";
		while ((line = br.readLine()) != null) {
			stupidSort(line);
		}
	}
	public static int[] tokenize(String line){
		
		String[] tokens=line.trim().split("\\|"); // the pipe (|) is a metacharacter in java, thus it has to be skipped
		limit=Integer.parseInt(tokens[1].trim());
		String[] lineArray=tokens[0].split(" ");
		int len=lineArray.length;

		int[] unsorted=new int[len];
		
		for(int x=0;x<len;x++){
			unsorted[x]=Integer.parseInt(lineArray[x]);
		}
	return unsorted;	
	}
	public static void stupidSort(String line) {
		int[] arr=tokenize(line);//the unsorted array
		
	//	System.out.println("\nunsorted:"+java.util.Arrays.toString(arr)); // :P to lazy to make the import statement
	//	System.out.println("limit: "+limit);
		int toMoveLeft=0;
		int temp=0;
		for (int i = 0; i < limit; i++) {
			if(i<arr.length-1){
				if(arr[i+1]<arr[i]){
				temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				
				}
			}

		}
		
		System.out.println(java.util.Arrays.toString(arr).replace("[","")
				.replace("]","").replace(",","").trim());
	}
}
