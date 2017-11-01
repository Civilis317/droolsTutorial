package org.playground.drools.DroolsTutotial;

public class Person {
	private String name;
	private int time;
	private String greet;

	@Override
	public String toString() {
		return "Person [name=" + name + ", time=" + time + ", greet=" + greet + "]";
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

}
