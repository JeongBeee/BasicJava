package addpractice;
 // 문제 이해 부족
public class practice_3_1 {
	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0); 
		// 모든 사과를 담는데 필요한 바구니의 수
		// 어차피 나머지는 10을 넘지 못하니 +1을 하면 된다.
																									
		System.out.println("필요한 바구니의 수 : " + numOfBucket);

	}

}
