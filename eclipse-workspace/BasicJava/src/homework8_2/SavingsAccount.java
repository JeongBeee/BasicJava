package homework8_2;

public class SavingsAccount extends BankAccount {
	private double interestRate; //이자율

	public SavingsAccount(int balance, double interestRate) {
		super(balance); //생성자 호출
		this.interestRate = interestRate; //잔액과 이자율필드를 초기화한다.
	}
	
	public void updateBalance(int period) { //저축기간
		balance += balance * interestRate * period;
	}
	
	public String getAccountType() {
		return "저축예금";	
	}
}