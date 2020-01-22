package model;

public class Horse {

	private String name;
	private int age;
	private String breed;
	
	public Horse() {
		super();
	}
	
	public Horse(String n, int a, String b) {
		name = n;
		age = a;
		breed = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	public String speak() {
		return "neigh";
	}
	
}
