package week1.day2Assignment;

public class LearnSwitchCase {
	
	public static void main(String[] args) {
		
		int a=2, b=3;
		String input ="Add";
		
		switch (input) {
		case "Add":
			
			System.out.println("Addition is " +(a+b));
			
			break;
			
		case "Sub":
			
			System.out.println("Subtraction is " +(a-b));
			
			break;
			
		case "Multiply":
			
			System.out.println("Multiplication is " +(a*b));
			
			break;
			
		case "Divide":
			
			System.out.println("Dividion is " +(a/b));
			
			break;

		default: System.out.println("Enter valid function ");
			break;
		}
		
		
	}

}
