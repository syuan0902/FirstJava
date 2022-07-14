package com.lcpan.m06p;

public class Test2_2 {
	public static void main(String[] args) {
		Feline[] felines = new Feline[2];
		felines[0] = new Cat();
		felines[1] = new Lion();
		for (Feline feline : felines)
			feline.run();
	}
}
