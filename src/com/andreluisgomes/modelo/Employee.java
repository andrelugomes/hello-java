package com.andreluisgomes.modelo;

public class Employee {

	private String name;
	private Integer age;

	public Employee() {
		name = "unknown";
		age = 100;
	}

	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}
