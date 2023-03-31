package homework7_4;

public class Customer {

	// 필드
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;
	
	// 생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName; // 필드 초기화
		this.lastName = lastName; // 필드 초기화
		accounts = new BankAccount[5]; // 배열 초기화
	}
	
	// 메소드
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts++] = account;
	}
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	@Override
	public String toString() {
		return String.format("이름: %s %s, 계좌의 갯수: %,d", firstName, lastName, numberOfAccounts);
	}
}
