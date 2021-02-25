package com.my.strategy.duck;

import com.my.strategy.duck.fly.FlyWithWings;
import com.my.strategy.duck.quack.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am mallard duck!");
	}
	

	
}
