package week1.day2Assignment;

public class FindIntersection {

	public static void main(String[] args) {
		int[] one = {3,2,11,4,6,7};
		int[] two = {1,2,8,4,9,7};
		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < two.length; j++) {
				if(one[i]==two[j])
					System.out.println("Similar variables " +one[i]);
			}
		}
		
	}
}
