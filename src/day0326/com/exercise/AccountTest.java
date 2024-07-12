package day0326.com.exercise;

public class AccountTest {

	public static void main(String[] args) {
		Acount account;
		account = new Acount("441-0290-1203",500000,7.3);
		
		System.out.println(account);
		account.despodit(20000);
		
		System.out.println("계좌 정보 : "+account.getAccount()+
				", 현재 잔액 : "+account.getBalance());
		
		System.out.println("이자 : "+account.calculateInterest());
	}

}
