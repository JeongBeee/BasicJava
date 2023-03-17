package chapter05;
// 배열 전체 항목의 합과 평균값을 구하는 프로그램
//[0][0] + [0][1] + ([1][0] + [1][1] + [1][2]) + [2][0] + [2][1] + [2][2] + [2][3] + [2][4]
public class Confirm_5_5 {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		
		avg = (double) sum / count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}

/*
for (int[] is : array) {
	for(int i : is) {
		sum += i;
		count++;
}}*/
