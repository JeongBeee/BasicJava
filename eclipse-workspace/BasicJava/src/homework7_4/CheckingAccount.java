package homework7_4;

public class CheckingAccount extends BankAccount {
	//필드
	private SavingsAccount protectedBy; // 연결된 저축 계좌(SavingsAccount)

	//생성자
	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy; //인자로 전달된 savingsaccount?
	}

	//메소드
	@Override
	public boolean withdraw(int amount) {
		if (amount > balance) { // 잔액보다 더 많은 값을 인출하려면 초과 값 만큼 savingsaccount에서 인출
			protectedBy.balance -= amount - balance;
			balance = 0;
			return true;
		}
		return super.withdraw(amount);
	}
}
