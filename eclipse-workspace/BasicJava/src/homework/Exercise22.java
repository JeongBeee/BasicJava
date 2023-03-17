package homework;
//02.변수와 타입
// 빛의 속도로 프록시마 센타우리까지 간다면 시간이 얼마나 걸릴까?

public class Exercise22 {
	public static void main(String[] args) {
		
		double distance = 40e12; // 지구로부터 센타우리별까지의 거리 40 * 10^12km
		double lightspeed = 300000; // 빛의 속도 300,000km/s (초)
		
		double sec = distance / lightspeed; // 거리/속도=시간 (초)

		double result = sec / (60 * 60 * 24 * 365); // 초 -> 년 , 1초(sec)/60초 * 60분 * 24시간 * 365일

		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + result + "광년이다.");
}
}

/* Other case
 package homework;

public class Exercise22 {
	public static void main(String[] args) {
		
		double distance = 40e12; // 지구로부터의 거리 40 * 10^12km
		double lightspeed = 300000; // 빛의 속도 300,000km/s (초)

		double result = distance / lightspeed / 60 / 60 / 24 / 365; // 초 -> 년 , 1초(sec)/60초 * 60분 * 24시간 * 365일

		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + result + "광년이다.");
}
}
 */