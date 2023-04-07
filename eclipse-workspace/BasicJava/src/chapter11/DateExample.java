package chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
	public static void main(String[] args) {
		// JDK 1.8 부터 사용가능
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시 mm분")));
	}
}
