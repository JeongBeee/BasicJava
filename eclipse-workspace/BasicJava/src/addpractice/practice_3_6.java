package addpractice;

public class practice_3_6 { // 문자형 변수 ch가 영문자이거나 숫자일때만 b가 true가 되는 코드
public static void main(String[] args) {
	char ch = '가';
	boolean b = (('a' <= ch && ch <= 'z') ||('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9')) ;
	System.out.println(b);
}
}
