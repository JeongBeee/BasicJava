package homework;

import java.util.Random;

// 주사위 각 면이 나오는 횟수 출력 프로그램
// 10,000번 던지기

public class Exercise49 {
	public static void main(String[] args) {

		System.out.println("----------");
		System.out.println("면    빈도");
		System.out.println("----------");

		Random random = new Random();
		int dice[] = new int[6]; // (1,2,3,4,5,6)

		for (int i = 1; i <= 10000; i++) { // 10000번 반복
			int n = random.nextInt(6) + 1; // 0부터 5 +1
			switch (n) {
			case 1:
				dice[0]++;
				break;
			case 2:
				dice[1]++;
				break;
			case 3:
				dice[2]++;
				break;
			case 4:
				dice[3]++;
				break;
			case 5:
				dice[4]++;
				break;
			case 6:
				dice[5]++;
				break;
			}
		}
		System.out.println("1" + "     " + dice[0]);
		System.out.println("2" + "     " + dice[1]);
		System.out.println("3" + "     " + dice[2]);
		System.out.println("4" + "     " + dice[3]);
		System.out.println("5" + "     " + dice[4]);
		System.out.println("6" + "     " + dice[5]);
	}

}



/*
 * 두번째 방법 
 * int dice[] = new int[6]; Random random = new Random();
 * 
 * for (int i = 1; i <= 10000; i++) { // 10000번 반복 int n = random.nextInt(6) +1; // 0부터 5 +1 
 * dice[n-1]++; 
 * }
 * 
 * System.out.println("----------"); System.out.println("면    빈도");
 * System.out.println("----------");
 * 
 * for (int i = 0; i < dice.length; i++) { // 0,1,2,3,4,5 까지
 * System.out.println((i+1) + "     " + dice[i]); }
 */