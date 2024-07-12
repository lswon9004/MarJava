package day0322.oob.init;


public class Bank {
	
int balance;
Bank() {}
void deposit(int d) {
	balance+=d;
}
void withdraw(int w) {
	if (balance>=w) {
		balance-=w;
	}else {
		System.out.println("잔액이 부족합니다.");
	}
	}
//boolean withdraw(int m) {
//	if (balance>m) {
//		balance-=m;
//		return true;
//	}
//}


void getBalance() {
	System.out.println("잔액 : "+balance);
}
}
