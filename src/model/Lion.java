package model;

public class Lion {
	private boolean hungry;
	private int age;
	private String name;

	/**
	 * Default constructor that takes no arguments.
	 */
	public Lion() {
		super();
	}

	/**
	 * Non-default constructor that takes all arguments.
	 */
	public Lion(boolean hungry, int age, String name) {
		super();
		this.hungry = hungry;
		this.age = age;
		this.name = name;
	}

	// Display animal noise.
	public String speak() {
		return "Roar!";
	}

	/**
	 * @return the hungry
	 */
	public boolean isHungry() {
		return hungry;
	}

	/**
	 * @param hungry the hungry to set
	 */
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
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
