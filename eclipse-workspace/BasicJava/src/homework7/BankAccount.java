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
		if (balance >= amount) { // 잔액 확인 (출금액이 현재 잔액보다 클 수 없다.)
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) { // 이체 메소드
		if (withdraw(amount) == true) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
	}
}



/*두번째 방법  
 * if (amount > balance) {
	return false;
}
balance -= amount;
otherAccount.balance += amount;
return true;  */

/*세번째 방법
 *  withdraw(amount);
otherAccount.deposit(amount);
return true; */
