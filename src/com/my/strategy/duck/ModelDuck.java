package com.my.strategy.duck;

import com.my.strategy.duck.fly.FlyNoWay;
import com.my.strategy.duck.quack.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am model duck!");
	}
	

	
}
