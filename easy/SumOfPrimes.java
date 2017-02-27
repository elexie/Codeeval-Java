package easy;

public class SumOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
	}
	
	int recursiveSum(int x){
		if(x==1000)
			return 0;
		return x+recursiveSum(x+2);
	}
	
	void isPrime(int x){
		
	}

}
