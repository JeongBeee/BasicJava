package homework;
//03.연산자
//메트로폴리스(거대도시) 판별 프로그램
//다음 두가지 조건 중 하나 만족->
//1. 한 나라의 수도이고, 인구가 100만 이상이어야 한다. 
//2. 연 소득이 1억 이상인 인구가 50만 이상이어야 한다.
import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수도입니까?(수도: 1, 수도아님: 0) ");
		int capital = scanner.nextInt();

		System.out.print("총 인구는?(단위: 만) ");
		int population = scanner.nextInt();

		System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");
		int income = scanner.nextInt();

		String result = (capital == 0 ? "메트로폴리스가 아닙니다." : population >= 100 ? "메트로폴리스입니다." : income >= 50 ? 
				"메트로폴리스입니다." : "메트로폴리스가 아닙니다.");
		//메트로폴리스가 0인 경우도 생각해야 함.
		
		System.out.println("이 도시는 " + result);
		
		scanner.close();
	}
}
