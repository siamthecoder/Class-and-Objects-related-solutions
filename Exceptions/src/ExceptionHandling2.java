import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		int userInput;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Please enter a positive integer: ");
			userInput = scan.nextInt();
			try {
				if(userInput < 0) {
					throw new ArithmeticException("No negative number is valid !!");
				}
				else {
					sum = sum + userInput;
				}
			}
			catch (ArithmeticException e) {
				System.out.println(e);
				i = i - 1;  
			}
		}
		
		System.out.println("Sum: " + sum);
	}

}

