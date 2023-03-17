package chapter04;

public class Confirm_4_2_6 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) { // 0123 = 전체 4줄
			for (int j = 0; j < 3 - i; j++) { // j = 0123 -> 012 -> 01 -> 0 = 공백 출력문
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) { // k = 0 -> 01 -> 012 -> 0123 = 별 출력문
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}


/* 두번째 방법
for (int i = 1; i <= 4; i++) { 
for (int j = 4; j > i; j--) { 
	System.out.print(" ");
}
for (int j = 1; j <= i; j++){
    System.out.print("*");
}
System.out.println();*/

/* 세번째 방법 
for (int i = 1; i <= 4; i++) {
for (int j = 4; j >= 1; j--) {
	if (j>i){
	System.out.print(" ");
	} else {
	System.out.print("*");
}
}
System.out.println();*/