package com.lcpan.m07_1;

public class Test1 {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.run();
		Dog dog = new Dog();
		dog.run();
		animal = dog;
		animal.run();
		animal = new Cat();
		animal.run();
		animal = new Lion();
		animal.run();
		Feline feline = new Lion();
		feline.run();
	}

}
