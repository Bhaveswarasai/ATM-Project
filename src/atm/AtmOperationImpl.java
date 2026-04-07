package atm;

import java.util.*;

public class AtmOperationImpl implements AtmInterface {
	ATM a = new ATM();

	Map<Double, String> ministmt = new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Avalible Balance:" + a.getBalance());

	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if (withdrawAmount % 500 == 0) {
			if (withdrawAmount <= a.getBalance()) {
				System.out.println("collect the cash" + withdrawAmount);
				a.setBalance(a.getBalance() - withdrawAmount);
				ministmt.put(withdrawAmount, "Amount withdrawn");
				viewBalance();
				
			} else {
				System.out.println("insufficient balance");
			}

		} else {
			System.out.println(" enter the amount in terms of 500");
		}

	}

	@Override
	public void depositeAmount(double depositeAmount) {
		System.out.println("depositeAmount is:" + depositeAmount);
		a.setBalance(a.getBalance() + depositeAmount);
		ministmt.put(depositeAmount, "Deposited Successfully");
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
	Set<Double> set = ministmt.keySet();
	
	for(double d : set) {
		System.out.println(d+"="+ministmt.get(d));
	}
	}

}
