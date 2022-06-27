import java.util.Scanner;

public class TestStudentII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Student s[] = new Student[5];
		
		int i;
		
		for(i = 0; i < 5; i++) {
			s[i] = new Student();
			
			System.out.print("Enter name of Student "+(i+1)+": ");
			s[i].name = input.nextLine();
			
			System.out.print("Enter ID of Student "+(i+1)+": ");
			s[i].id = input.nextInt();
			input.nextLine();
			
			System.out.print("Set the Email address for Student "+(i+1)+": ");
			s[i].email = input.nextLine();
			
			System.out.println();
		}
		
		for(i = 0; i < 5; i++) {
			System.out.println("~~~~~~~~~~~~~~~~~~~");
			
			System.out.print("Name of Student "+(i+1)+": ");
			s[i].profile();
			System.out.println();
			
			System.out.print("ID of Student "+(i+1)+": "+s[i].getID());
			System.out.println();
			
			System.out.print("Email address of Student "+(i+1)+": "+s[i].getEmail());
			System.out.println();
			
			System.out.println("~~~~~~~~~~~~~~~~~~~");
			
			System.out.println();
			System.out.println();
		}
		
		
	}

}
