import java.sql.Date;

public class Employee extends Person {
	private int Office;
	private double Salary;
	private Date dateHired;
	
	@Override
	public String toString() {
		return String.format(getName(), Employee.class);
	}
	public static void main(String [] args) {
		System.out.println(Employee.class.toString());
		System.out.println(getName().toString());
	}
}
