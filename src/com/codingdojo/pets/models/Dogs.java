package com.codingdojo.pets.models;

public class Dogs extends Animal implements petInterface {
	
	public Dogs(String name, String breed, Double weight){
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public String showAffection() {
		if (this.weight < 20) {
			System.out.println("Kinda love you");
			return "Kinda love you";
		}
		
		else if (this.weight < 30) {
			System.out.println("Love ya!");
			return "Love ya!";
		}
		
		else if (this.weight < 60 ) {
			System.out.println("Love you so much!");
			return "Love you so much!";
		}
		
		else if (this.weight < 100) {
			System.out.println("Love you sooooooo much!");
			return "Love you sooooo much!";
		}
		
		else {
			System.out.println("Love you to infinity!");
			return "Love you to infinity";
		}
	}

}
