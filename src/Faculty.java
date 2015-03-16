
public class Faculty extends Employee {
	private int officeHours;
	private int rank;

public Faculty(int officeHours, int rank) {
	super();
	this.officeHours = officeHours;
	this.rank = rank;
}
	@Override
	public String toString() {
		return String.format(getName(), Faculty.class);
	}
	public static void main(String [] args) {
		System.out.println(Faculty.class.toString());
		System.out.println(getName().toString());
	}
}	
/*
 
Override the toString method in each class to display the
 class name and the person's name.

Draw the UML diagram for the classes.
Write the code for the Student class only.
*/