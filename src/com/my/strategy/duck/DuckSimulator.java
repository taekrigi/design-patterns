package com.my.strategy.duck;

import com.my.strategy.duck.fly.FlyRocketPowered;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();  
		
		Duck model = new ModelDuck();
		model.performFly(); 
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
	
	}
}
