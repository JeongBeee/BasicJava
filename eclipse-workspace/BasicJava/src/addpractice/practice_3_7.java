package addpractice;

public class practice_3_7 {
public static void main(String[] args) {
	char ch = 'A';
	char lowerCase = (65 <= ch) ? (char) (ch + 32) : ch;
	// 문자열로 변환이 필요함.
	
	System.out.println("ch: " + ch);
	System.out.println("ch to lowerCase: "+lowerCase);
}
}
