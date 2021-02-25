package com.my.strategy.duck.fly;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I fly using rocket power...!");
	}
}
