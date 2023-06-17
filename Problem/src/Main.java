import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Shape[] shapeArray = new Shape[5];
		
		shapeArray[0] = new Circle("circleOne", 1);
		shapeArray[1] = new Circle("circleTwo", 2);
		shapeArray[2] = new Circle("circleThree", 3);
		shapeArray[3] = new Rectangle("rectangleOne", 1.2, 2.0);
		shapeArray[4] = new Rectangle("rectangleTwo", 2.0, 3.0);
		
		
		
		int circleCounter = 0, rectangleCounter = 0;
		double circleArea = 0, rectangleArea = 0;
		
		for(int i = 0; i < 5; i++) {
			if(shapeArray[i] instanceof Circle) {
				circleCounter++;
				circleArea += ((Circle)(shapeArray[i])).getArea();
			}
			else {
				rectangleCounter++;
				rectangleArea += ((Rectangle)(shapeArray[i])).getArea();
			}
		}
		
		System.out.println("Total Circles: "+circleCounter);
		System.out.println("Total Rectangles: "+rectangleCounter);
		
		System.out.println("Total Area of Circles: "+circleArea);
		System.out.println("Total Area of Rectangles: "+rectangleArea);
		
		int i = 0;
		
		while(i < 3) {
			try {
				System.out.println("Resize the Circle: "+i+": ");
				Scanner input = new Scanner(System.in);
				
				int size = input.nextInt();
				((Circle)(shapeArray[i])).resize(size);
				i++;
			}
			catch(MyException e) {
				i--;
				i++;
				System.out.println(""+e);
			}
		}
	}

}
