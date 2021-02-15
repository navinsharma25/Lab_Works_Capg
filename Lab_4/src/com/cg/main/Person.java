package com.cg.main;

public class Person {

	private String name;
	private float age;
	
	public Person(String name,int age)
	{
		this.age=age;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return (int) age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
