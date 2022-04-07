package com.training.model;

public class HealthInsurance extends Insurance {
	
	private String[] preExistingDiseases;
	private double calculatePremium;
	
	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDiseases,
			double calculatePremium) {
		super(policyNumber, policyHolderName);
		this.preExistingDiseases = preExistingDiseases;
		this.setCalculatePremium(calculatePremium);
	}

	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String[] getPreExistingDiseases() {
		return preExistingDiseases;
	}

	public void setPreExistingDiseases(String[] preExistingDiseases) {
		this.preExistingDiseases = preExistingDiseases;
	}

	public HealthInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}

	public HealthInsurance(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public double calculatePremium() {
		double premium = 10000;
		for(String eachitem : preExistingDiseases) {
			if(eachitem.equals("bp") || eachitem.equals("sugar")) {
				premium = 15000;
			}
		}
		return premium;
	}

	public double getCalculatePremium() {
		return calculatePremium;
	}

	public void setCalculatePremium(double calculatePremium) {
		this.calculatePremium = calculatePremium;
	}

}
