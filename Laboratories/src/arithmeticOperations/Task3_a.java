package arithmeticOperations;

import java.util.Scanner;

public class Task3_a {
	public static void main(String[] args) {
		// TODO auto-generated method stub
		int sum = 0;
		int elemNo = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int currElem = sc.nextInt();
			if(currElem > 10) {
				sum = sum + currElem;
				elemNo=elemNo+ 1;
			}
		}
		if(elemNo == 0) {
			System.err.print("No data available\n");
			System.exit(1);
		}
		sc.close();
		System.out.print("the sum of integers greater than 10");
		System.out.print(" is " + sum + "\n");
		System.exit(0);
	}
}
