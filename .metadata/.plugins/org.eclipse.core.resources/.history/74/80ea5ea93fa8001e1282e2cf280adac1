package model;

public class Account {

	private Integer numberAccount;
	private String name;
	
	private Double initialBalance;
	private Double withdrawLimit;
	
	public Account() {
	}
	
	public Account(Integer numberAccount, String name, Double initialBalance, Double withdrawLimit) {
		super();
		this.numberAccount = numberAccount;
		this.name = name;
		this.initialBalance = initialBalance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumberAccount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getInitialBalance() {
		return initialBalance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void withdrawAccount(double withdraw) {
		if (withdraw > withdrawLimit) {
			throw new IllegalArgumentException("O valor excede o limite de saque");
		} else if (withdraw > initialBalance) {
			throw new IllegalArgumentException("Saldo insuficiente");
		} else {
			this.initialBalance -= withdraw;
		}
	}
	
}
