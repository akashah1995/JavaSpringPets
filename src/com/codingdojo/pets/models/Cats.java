package com.codingdojo.pets.models;

public class Cats extends Animal implements petInterface {
	
	public Cats(String name, String breed, double weight){
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	};
	
	public String showAffection() {
		System.out.println("Im a cat so Im selfish and don't really care that you're petting me");
		return "Im a cat so Im selfish and don't really care that you're petting me";
	}

}
