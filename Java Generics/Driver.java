
public class Driver {

	public static void main(String[] args) {
		
		Generic<Integer> iObj = new Generic<>(212);
		
		iObj.showType();
		
		Generic<String> iObjTwo = new Generic<>("Hi NSUer");
		
		iObjTwo.showType();

	}

}
