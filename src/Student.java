
public class Student extends Person {
	private classStatus status;
	
	@Override
	public String toString() {
		return String.format(getName(), Student.class);
	}
	public static void main(String [] args) {
		System.out.println(Student.class.toString());
		System.out.println(getName().toString());
	}
}
