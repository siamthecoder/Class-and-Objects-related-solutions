
public class Main {

	public static void main(String[] args) {
		
		Tuple<String, String> tuple = new Tuple<>("Siam", "Hossain");
		
		tuple.showTypes();
		
		Tuple<String, Tuple<Integer, Integer>> tuplesWeb = new Tuple<>("Siam", new Tuple<>(235, 578));
		
		tuplesWeb.showTypes();

	}

}
