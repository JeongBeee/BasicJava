package chapter06;

import java.util.jar.Attributes.Name;

public class BankAccount {
	static int balance; // 잔액 static이 붙으면 a와 b가 값을 공유한다.
	String name;
	
	//입금 메소드
	static void deposit(int amount) {
		balance += amount;
		BankAccount account = new BankAccount();
		account.name = "홍길동";
	}
	
	//출금 메소드
	void withdraw(int amount) {
		balance -= amount;
		name = "홍길동";
	}
}
