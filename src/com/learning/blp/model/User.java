package com.learning.blp.model;

public class User {
	private String name;
	private int age;

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

}
