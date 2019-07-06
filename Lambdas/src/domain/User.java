package domain;

public class User {
	
	private String name;
	private String lastName;
	private int age;
	private Address address;
	
	
	
	
	public User(String name, String lastName, int age, Address address) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.lastName+" "+this.age+" "+this.address.getName();
	}
	
	
	

}
