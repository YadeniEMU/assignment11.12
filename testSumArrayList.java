package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class testSumArrayList {

	public static void main(String[] args) {
		ArrayList<Double> sumArray = new ArrayList<>();
		
		
		System.out.println("Enter 5 numbers: ");
		Scanner input = new Scanner(Sytem.in);
		double value;
		
		for( int i = 0; i<5; i++) {
			value = input.nextDouble;
			sumArray.add(value)
		}
		double result = sum(sumArray);
		System.out.println("The sum of the numbers you entered is " + result);
	}

	public static double sum(ArrayList<Double> list) {
		double sum1 = list.get(0) + list.get(1) + list.get(2) + list.get(3) + list.get(4);
		return sum1;
	}
}
