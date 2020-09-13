package week1.day1Assignment;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int thirdNum;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for (int i = 3; i<=range; i++)
			
		{
			
			thirdNum = firstNum+secNum;
			
			System.out.println(thirdNum);
			
			firstNum = secNum;
			secNum = thirdNum;
		}
		
	}

}
