package com.training.services;
import com.training.model.BankAccount;

public class Application {
	public static void main(String[] args) {
		BankAccountService service = new BankAccountService();
		
		BankAccount ram = new BankAccount(1200,"Ramesh",5000);
		
		double simpleInterest = service.calculateInterest(ram);
		
		System.out.println("simple Interest:"+simpleInterest);
		
		BankAccount jaya = new BankAccount(6200,"Rajesh",5000);
		double simpleInterest2 = service.calculateInterest(jaya);
		
		System.out.println("simple Interest:@5%:"+simpleInterest2);
//		BankAccount[] accounts = new BankAccount[2];
//		accounts[0]=ram;
//		accounts[1]=jaya;
//		service.calculateInterest(accounts);
		BankAccount[] accounts = {ram,jaya};
		service.calculateInterest(accounts);
		System.out.println("======");
		double[] values = service.findInterest(accounts);
		for(double eachValue: values) {
			System.out.println("=====Arrays=====");
		}
		BankAccount[] accountList = {
				new BankAccount(800,"jay",5000,"savings"),
				new BankAccount(800,"kim",6000,"savings"),
				new BankAccount(800,"tom",7000,"savings")
		};
		double[] interestValues = service.findInterestByAccountType(accountList);
		for(double eachvalue: interestValues) {
			System.out.println(eachvalue);
		}
		}

}
