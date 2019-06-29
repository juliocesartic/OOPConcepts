package domain;

public class User {
	private int id;
	private String name;
	private String email;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showUser() {
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Email: " + this.email);
		System.out.println("Age: " + this.age);
	}
	
}
