package week1.day2Assignment;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int input = 13;
		
		boolean flag = true;
		
		for (int i=1; i<input/2; i++)	
		{
			if (input%i == 0) {
				
				flag = true;
				System.out.println("Number is Prime" +input);
				break;
			}
				else
					System.out.println("Number is not Prime" +input);
		}	
		
	}

}
