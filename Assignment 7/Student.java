
public class Student {
	//data fields
	String name;
	String email;
	int id;
	static int totalStudents;
	
	Student() {
		this.name = "NULL";
		this.id = 000;
		this.email = "N/A";
		totalStudents++;
	}
	
	public int getID() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void profile() {
		System.out.print(name);
	}
}
