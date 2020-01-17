package model;

public class Pig {
	private String name;
	private String color;
	private int age;
	private boolean clean;
	private String happyOink = "Oink!";
	private String sadOink = "Squeal!";

	public Pig() 
	{
		super();
	}

	public Pig(String name, String color, int age) 
	{
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		this.clean = true;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String speak() 
	{
		if(isClean())
		{
			return sadOink;
		}
		else
		{
			return happyOink;
		}
	}
	
	public void bathe()
	{
		clean = true;
	}
	
	public void playInMud()
	{
		clean = false;
	}
	
	public boolean isClean()
	{
		return clean;
	}
}


