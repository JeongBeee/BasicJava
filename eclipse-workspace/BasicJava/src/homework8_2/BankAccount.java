package homework8_2;

public abstract class BankAccount {

	// 계좌 종류를 반환하는 메소드 SavingsAccount => 저축예금, CheckingAccount => 당좌예금
	public abstract String getAccountType();

	// 필드
	protected int balance;

	// 생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}

	// 메소드
	public int getBalance() {
		return balance;
	}
	
	// 입금 메소드	
	// @param amount 입금할 금액
	public void deposit(int amount) {
		balance += amount;
	}
	
	// 출금 메소드
	// @param amount 출금할 금액
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	// 이체 메소드
	// @param amount 이체할 금액
	// @param otherAccount 이체될 계좌번호

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
}
