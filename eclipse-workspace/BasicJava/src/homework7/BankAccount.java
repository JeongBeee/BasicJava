package homework7;

public class BankAccount {

	// 필드
	private int balance; // 잔액

	// 생성자

	public BankAccount(int balance) {
		this.balance = balance;
	}

	// 메소드
	public int getBalance() { // 현재 계좌의 잔액
		return balance;
	}

	public void deposit(int amount) { // 입금 메소드
		balance += amount;
	}

	public boolean withdraw(int amount) { // 출금 메소드
		if (balance >= amount) { // 잔액 확인
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (withdraw(amount) == true) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
	}
}
