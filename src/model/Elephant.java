package model;

public class Elephant {
	private boolean isDomesticated;
	private int age;
	private String name;

	/**
	 * Default constructor that takes no arguments.
	 */
	public Elephant() {
		super();
	}

	/**
	 * Non-default constructor that takes all arguments.
	 */
	public Elephant(boolean isDomesticated, int age, String name) {
		super();
		this.isDomesticated = isDomesticated;
		this.age = age;
		this.name = name;
	}

	// Display animal noise.
	public String speak() {
		return "Trumpet!";
	}

	/**
	 * @return isDomesticated
	 */
	public boolean isDomesticated() {
		return isDomesticated;
	}

	/**
	 * @param isDomesticated
	 */
	public void setDomesticated(boolean isDomesticated) {
		this.isDomesticated = isDomesticated;
	}
	

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
