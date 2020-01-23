package model;

public class Frog {

	private String name;
	private String Color;
	private int age;
	
	public Frog() {
		super();
	}

	public Frog(String name, String color, int age) {
		super();
		this.name = name;
		Color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String speak() {
		return "ribbit";
	}
	
}
