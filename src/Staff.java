
public class Staff extends Employee {
	private String Title;
	
	@Override
	public String toString() {
		return String.format(getName(), Staff.class);
	}
	public static void main(String [] args) {
		System.out.println(Staff.class.toString());
		System.out.println(getName().toString());
	}
}
