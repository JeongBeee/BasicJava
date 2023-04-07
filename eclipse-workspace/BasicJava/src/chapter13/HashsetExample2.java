package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample2 {
	public static void main(String[] args) {
		Set<Student2> set = new HashSet<Student2>();

		set.add(new Student2(1, "홍길동"));
		set.add(new Student2(2, "신용권"));
		set.add(new Student2(1, "조민우")); // 학번이 같으므로 저장되지 않음

		Iterator<Student2> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student2 student2 = iterator.next();
			System.out.println(student2.studentNum + ":" + student2.name);
		}
	}
}
