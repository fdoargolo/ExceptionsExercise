package exercise.entities;

import exercise.exceptions.InputException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withdrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withdrawLimit = withDrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withDraw(Double amount) throws InputException {
		if (amount > withdrawLimit)
			throw new InputException("The amount exceeds withdraw limit");
		else if (amount > balance)
			throw new InputException("Not enough balance");
		else
			balance -= amount;
	}

	@Override
	public String toString() {
		return "New balance: " + balance;
	}

}
