package easy;

import java.util.Arrays;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Your program should accept as its first argument a path to a filename. Input
 * example is the following
 * 
 * 70.920 -38.797 14.354 99.323 90.374 7.581 -37.507 -3.263 40.079 27.999 65.213
 * -55.552
 * 
 * Output: -38.797 7.581 14.354 70.920 90.374 99.323 -55.552 -37.507 -3.263
 * 27.999 40.079 65.213
 * 
 * @author Elexie
 *
 *         The problem will be solved using 5 basic sorting algorithms:
 *         bubblesort, insertionsort selectionsort, mergesort,quicksort,heapsort
 */
public class SimpleSorting {

	    public static void main (String[] args) throws IOException {
	    	String path="practice/simpleSort.txt";
	        File file = new File(path);
	        System.out.println("Attempting to read from file in: "+file.getCanonicalPath());

	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            if(line.length()>0){
	            	// Process line of input Here
		            double[] sorted=insertionSort(line);
		            String sortedString="";
		          for(int x=0;x<sorted.length;x++){
		        	  sortedString+=sorted[x]+" ";
		          }
		            System.out.println(sortedString.trim()); 	
	            }
	            
	        }
	       buffer.close();
	    }
	    
	    public static double[] insertionSort(String line){
	        String[] lineArray=line.split(" ");
	        double[] doubleArray=new double[lineArray.length];
	        //copy the elements of lineArray into doubleArray
	        for(int x=0;x<doubleArray.length;x++){
	            doubleArray[x]=Double.valueOf(lineArray[x]);
	        }
	        
	        //sort
	        int j;
	        double newVal;
	        for(int i=1;i<doubleArray.length;i++){
	            newVal=doubleArray[i];
	            j=i;
	            while(j>0 && doubleArray[j-1]>newVal){
	                doubleArray[j]=doubleArray[j-1];
	                j--;
	            }
	        doubleArray[j]=newVal;
	        }
	    return doubleArray;
	    }

}	

