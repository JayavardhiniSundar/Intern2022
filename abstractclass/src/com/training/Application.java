package com.training;

import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.LifeInsurance;
import com.training.model.VechicleInsurance;

public class Application {
	
	public static void printPremium(Insurance object) {
		System.out.println(object.calculatePremium());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VechicleInsurance car = new VechicleInsurance(1010,"ramesh","car",2019);
		
		printPremium(car);
		
		LifeInsurance life = new LifeInsurance(2020,"jaya",27);
		printPremium(life);
		
		String[] illness = {"bp","sugar","ent","thyroid"};
		HealthInsurance health = new HealthInsurance(3030,"vicky",illness);
		printPremium(health);
	}

}
