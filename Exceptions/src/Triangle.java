import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int s1, s2, s3;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Side 1: ");
		s1 = scan.nextInt();
		
		System.out.print("Enter Side 2: ");
		s2 = scan.nextInt();
		
		System.out.print("Enter Side 3: ");
		s3 = scan.nextInt();
		
		try {
			if(((s1 + s2) <= s3) || ((s1 + s3) <= s2) || ((s2 + s3) <= s1)) {
				throw new IllegalTriangleException("Sum of any two sides must be greater than the third side!!");
			}
			else {
				System.out.println("The Triangle is Valid !!");
			}
		}
		catch (IllegalTriangleException e) {
			System.out.println(e);
		}
		
	}

}

