package chapter05;
// 배열의 최대값을 구하는 프로그램
public class Confirm_5_4 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
        for (int i = 0; i < array.length; i++) {
			 if(array[i] > max) {
			 max = array[i];
			 }
			}
        System.out.println("max: " + max);
		}
}
