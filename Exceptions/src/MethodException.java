import java.util.Scanner;

public class MethodException {

	public static double getSquareRoot(int N) throws MyException {
		if(N < 0) {
			throw new MyException("Sorry! This is negative");
		}
		return Math.sqrt(N);
	}
	
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = scan.nextInt();
		
		try {
			double result = getSquareRoot(num);
			System.out.println("Result: " + result);
		}catch (MyException e) {
			System.out.println(e);
		}
		
	}

}

