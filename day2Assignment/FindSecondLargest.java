package week1.day2Assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		Arrays.parallelSort(data);
		int dataSize=data.length;
		System.out.println("The second largest is " +data[dataSize-2]);

	}

}
