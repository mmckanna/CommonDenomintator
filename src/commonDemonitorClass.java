import java.util.Scanner;

public class commonDemonitorClass {

	static int findGCD(int firstNumber, int secondNumber) {
		while (secondNumber != 0) {
			int temp = secondNumber;
			secondNumber = firstNumber % secondNumber;
			firstNumber = temp;
		}
		return firstNumber;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int firstNumber = input.nextInt();

		System.out.println("Please enter the second number: ");
		int secondNumber = input.nextInt();

		int GCD = findGCD(firstNumber, secondNumber);

		System.out.println("The greatest common divisor between the two numbers is: " + GCD);
	}

}
