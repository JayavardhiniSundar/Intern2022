 package com.training.model;

public class VechicleInsurance extends Insurance {
	
	private String vechicleModel;
	



	


	public VechicleInsurance(int policyNumber, String policyHolderName, String vechicleModel, int yearOfManufacture) {
		super(policyNumber, policyHolderName);
		this.vechicleModel = vechicleModel;
		this.yearOfManufacture = yearOfManufacture;
	}


	private int yearOfManufacture;
	

	@Override
	public double calculatePremium() {
		
		double premium = 1000;
		
		if(yearOfManufacture<2020 && vechicleModel.equals("car")) {
			premium = 2000;
		}
		// TODO Auto-generated method stub
		return premium;
	}

}
