import java.util.ArrayList;
import java.util.Scanner;

public class testSumArrayList {

	public static void main(String[] args) {
		ArrayList<Double> sumArray = new ArrayList<>(); //the array list
		
		
		System.out.println("Enter 5 numbers: "); //asked user to put the numbers they want to put in
		Scanner input = new Scanner(Sytem.in);
		double value;
		
		for( int i = 0; i<5; i++) {
			value = input.nextDouble; //added the numbers to the arrayList
			sumArray.add(value)
		}
		double result = sum(sumArray); //called the methos to sum the numbers 
		System.out.println("The sum of the numbers you entered is " + result);
	}

	public static double sum(ArrayList<Double> list) { // a method that can add the numbers in an array
		double sum1 = list.get(0) + list.get(1) + list.get(2) + list.get(3) + list.get(4);
		return sum1;
	}
}
