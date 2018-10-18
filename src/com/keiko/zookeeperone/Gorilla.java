package com.keiko.zookeeperone;

public class Gorilla extends Mammal {
	public void throwSomthing() {
		this.energyLevel -=5;
		System.out.println("Gorilla has thrown and current energy level is " + energyLevel);
	}
	public void eatBananas() {
		this.energyLevel +=10;
		System.out.println("Gorilla has eaten bananas and current energy level is " + energyLevel);
	}
	public void climb() {
		this.energyLevel -=10;
		System.out.println("Gorilla has climbed and current energy level is " + energyLevel);
	}
}
