package homework7;

import java.text.DecimalFormat;

public class Customer {

	// 필드
	private String firstName; // 고객 이름
	private String lastName; // 고객 성
	private BankAccount account; // 고객이 소유한 계좌
	DecimalFormat df = new DecimalFormat("###,###"); // 천단위 콤마 찍기
	
	// 생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// 메소드
	public BankAccount getAccount() {
		return account;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return String.format("이름: %s %s , 잔고: %s원" , firstName , lastName, df.format(account.getBalance()) );
		//return String.format("이름: %s %s , 잔액: %,d원"  firstName , lastName , account.getBalance());
	}
}

