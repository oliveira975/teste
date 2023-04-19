package entities;

public class Account {
	private String name;
	private double value;
	private int account;
	
	public Account() {
		
	}
	
	public Account(String name,int account) {
		this.name = name;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public double getValue() {
		return value;
	}
	
	public double addValue(double value) {
		return this.value += value;
	}
	
	public double rmValue (double value) {
		return this.value -= value;
	}



}


