
public class Person {
	private static String name;
	private static String address;
	private static String emailAddress;
	private static int phoneNumber;
	
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public static int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return String.format(getName(), Person.class);
	}
	public static void main(String [] args) {
		System.out.println(Person.class.toString());
		System.out.println(getName().toString());
	}
}
/*
 * 

Draw the UML diagram for the classes. 
Write the code for the Student class only. */
