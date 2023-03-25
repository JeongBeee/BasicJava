package homework;

public class Time {
	// 필드
	private int hour;
	private int minute;
	private int second;

	// 생성자
	public Time() {
		//this.hour=0; 안써도 됨
	}

	public Time(int hour, int minute, int second) {
		if (hour > 0 && 24 > hour) {
			this.hour = hour;
		}
		if (minute > 0 && 60 > minute) {
			this.minute = minute;
		}
		if (second > 0 && 60 > second) {
			this.second = second;
		}
	}

	// 메소드
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);  //문자열로 반환 2->2자리라는 뜻 0->자리가 비면 0으로 채우라는 뜻
		//System.out.printf();와 같음 ->직접 코드 보여주는 거 
	}
}



	


