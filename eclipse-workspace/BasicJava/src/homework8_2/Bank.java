package homework8_2;

public class Bank {

	// 필드
	private Customer[] customers; // 고객 목록
	private int numberOfCustomers; // 고객 수

	// 생성자
	public Bank() {
		customers = new Customer[10]; // 배열 크기를 10으로 초기화한다.
	}

	// 메소드
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}
}
