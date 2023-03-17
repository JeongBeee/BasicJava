package homework;
//03.연산자
//문제 이해 부족
//큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램
//임의의 두 정수 a,b에 대하여  ((a + b) + |a - b|) / 2는 큰 수,  
//((a + b) - |a - b|) / 2는 작은 수이다. 
//절대값을 반환하는 메소드: Math.abs(숫자)
import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 숫자를 입력하세요: ");
		int a = Integer.parseInt(scanner.nextLine());  // 문자열로 받고, 정수형으로 변환

		System.out.print("두 번째 숫자를 입력하세요: ");
		int b = Integer.parseInt(scanner.nextLine());

		int big = ((a + b) + Math.abs(a - b)) / 2 ; // 문제에서 제시한 큰수, 작은수 공식 대입
		int small = ((a + b) - Math.abs(a - b)) / 2 ; // Math.abs 절대값 공식
		
		// big / small, big % small 변수 생성해도 됨.

		System.out.print("큰 수를 작은 수로 나눈 몫은 " + big / small + "이고, 나머지는 " + big % small + "이다.");
		scanner.close();
	}
}
