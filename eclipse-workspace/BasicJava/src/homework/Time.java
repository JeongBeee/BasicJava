package homework;

public class Time {
	// 필드
	private int hour = 0;
	private int minute = 0;
	private int second = 0; // = 0 생략가능

	// 생성자 (객체를 만들 때 호출, new)
	public Time() {	
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

	// 메소드 (언제든 호출 가능)
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);  // 문자열로 반환 , 앞을 0으로 채워라
	}
}

/* private int hour;
   private int minute;
   private int second;

public Time(){

}

publid Time(int hour, int minute,int second){
}

public String tostring(){
return null; // 일단 기본값 작성
}*/