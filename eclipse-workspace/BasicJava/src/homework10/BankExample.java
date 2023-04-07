package homework10;

public class BankExample {
	public static void main(String[] args) {
		CheckingAccount tonyAccount = new CheckingAccount(3000);
		CheckingAccount steveAccount = new CheckingAccount(4000);
		try {
			tonyAccount.transfer(5000, steveAccount);
			System.out.println("송금 완료");
		} catch (NullPointerException e) { // otherAccount가 null이면
			System.out.println("해당하는 계좌가 없습니다.");
			System.out.println("송금 실패");
		} catch (IllegalArgumentException e) { // amount값이 음수이거나 balance보다 크면
			System.out.println("해당하는 금액을 보낼 수 없습니다.");
			System.out.println("송금 실패");
		}
		try {
			tonyAccount.transfer(2000, null);
			System.out.println("송금 완료");
		} catch (NullPointerException e) { // otherAccount가 null이면
			System.out.println("해당하는 계좌가 없습니다.");
			System.out.println("송금 실패");
		} catch (IllegalArgumentException e) { // amount값이 음수이거나 balance보다 크면
			System.out.println("해당하는 금액을 보낼 수 없습니다.");
			System.out.println("송금 실패");
		}
	}
}
