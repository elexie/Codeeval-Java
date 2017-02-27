package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
public class LowestUniqueNumber {

	public static void main(String[] args)throws IOException
	{
		BufferedReader bf=new BufferedReader(new FileReader("Practice\\test.txt"));
		LowestUniqueNumber lun=new LowestUniqueNumber();
	while(bf.ready())
		{
		System.out.println(lun.findLowestUniqueNumber(bf.readLine()));
		}
	
	
	bf.close();
		
	}
	int findLowestUniqueNumber(String line)
	{
	String[] lineArray=line.split(" ");//store digits as string in array
	int lowestUnique=0;
	LinkedList<Integer> uniqueList=new LinkedList<>();
	LinkedList<Integer> uniquePlayer=new LinkedList<>();
	for(int x=0;x<lineArray.length;x++)//add uniqueArray[x] to "list" if it doesn't repeat
		{
		int rank=0;
			for(int y=0;y<lineArray.length;y++)
			{
				if(Integer.valueOf(lineArray[x])==Integer.valueOf(lineArray[y]))
				{
				rank++;
				}
			}
			if(rank==1)
			{
			uniqueList.add(Integer.valueOf(lineArray[x]));
			uniquePlayer.add(x);
			}
		}
	
	for(int x=0;x<uniqueList.size();x++)//find the lowest unique #
		{
			int a=uniqueList.get(x);
			int rank=0;
			for(int y=0;y<uniqueList.size();y++)
			{
				int b=uniqueList.get(y);
				if(a<b)
				{
				rank++;
				}
			}
		if(rank==uniqueList.size()-1)
			{
			lowestUnique=uniquePlayer.get(x)+1;	
			}
		}
	return lowestUnique;
	}

}
