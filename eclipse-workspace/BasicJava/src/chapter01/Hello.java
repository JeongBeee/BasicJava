package chapter01;
public class Hello {
	/**
	 * 이 메소드는 
	 * @param args
	 */
    public static void main(String[] args) {
      System.out.println("Hello, Java");
      System.out.println("덧셈 결과: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
    }
}