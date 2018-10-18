package com.keiko.zookeeperone;

public class Bat extends Mammal {
	public Bat(){//instantiate
		this.energyLevel=300; //overriding
	}
	public void fly() {
		this.energyLevel -=50;
		System.out.println("Bat has flown and current energy level is " + energyLevel);
	}
	public void eatHumans() {
		this.energyLevel +=25;
		System.out.println("Bat has eaten human and current energy level is " + energyLevel);
	}
	public void attackTown() {
		this.energyLevel -=100;
		System.out.println("Bat has attacked town and current energy level is " + energyLevel);
	}
}
