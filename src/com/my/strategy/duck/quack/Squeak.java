package com.my.strategy.duck.quack;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("bbik!");
	}

}
