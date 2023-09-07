package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer 1:");
		int num0 = in.nextInt();
		System.out.println("Enter integer 2:");
		int num1 = in.nextInt();
		
		
		
		
		double average = (num0 + num1)/2.0;
		System.out.println("Average: "+ average);

	}

}