package day0326.com.exercise;

public class Acount {
private String account;
private int  balance;
private double interestRate;

public Acount() {}

public Acount(String account, int balance, double interestRate) {
	this.account = account;
	this.balance = balance;
	this.interestRate = interestRate;
}

public String getAccount() {
	return account;
}

public void setAccount(String account) {
	this.account = account;
}

public int getBalance() {
	return balance;
}
public double calculateInterest() {
	return balance * (interestRate*0.01);
}
public void despodit(int money) {
	balance += money;
}
public void withdraw(int money) {
	balance -=money;
}

@Override
public String toString() {
	return "계좌 정보 : " + account + ", 현재 잔액 : " + balance;
}



}
