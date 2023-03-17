package chapter04;

public class Confirm_4_2_5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) { // 1 2 3 4 (세로)
			for (int j = 1; j <= i; j++) { // j는 매번 1로 초기화 (가로)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


// 기본) 별 4개씩 4줄 출력문
/* for (int i = 1; i <= 4; i++) {
	for (int j = 1; j <= 4; j++) {
	 System.out.print("*");
	}
	System.out.println("");
	}
}*/

/*for (int i = 1; i <= 4; i++) { // 1 2 3 4 (세로)
	for (int j = 4; j > i; j--) { // j는 매번 1로 초기화 (가로)
		System.out.print(" ");
	}
	for (int j = 1; j <= i; j++){
	    System.out.print("*");
	}
	System.out.println();*/