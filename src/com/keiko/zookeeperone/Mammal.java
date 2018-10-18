package com.keiko.zookeeperone;

public class Mammal {
	public int energyLevel;
	public Mammal() { // need to instantiate
		this.energyLevel=100;
	}
	public void displayEnergy() {
		System.out.println("Mammal's energy level is" + this.energyLevel);
	}
}
