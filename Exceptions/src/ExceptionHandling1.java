import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		int[] ara = new int[100];
		int index, checking;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++) {
			int randomValue = (int)(Math.random() * 100);
			ara[i] = randomValue; // 1 -2--3-------------- 100
		}
		
		System.out.print("Enter your desired index: ");
		index = scan.nextInt();
		
		try {
			System.out.println("Value at index " + index + ": " + ara[index]);
			checking = ara[index] / 0;
			System.out.println("Result: " + checking);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println("Division by 0 is not possible: " + e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program Ends!!");
		}
	}

}

