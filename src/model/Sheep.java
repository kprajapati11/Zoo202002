package model;
public class Sheep {
	private String name;
	private String color;
	private int age;

	public Sheep() {
		super();
		
	}

	public String getName() {
		return name;
	}
	
	public Sheep(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String speak() {
		return "Baaaaa";
	}
	

}
