package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	
	list.add("Java");
	list.add("JDBC");
	list.add("Servlet/JSP");
	list.add(2, "Database"); // 2번째에 있던 Servlet은 3번째로 옮겨지고 Database가 2번째로
	list.add("iBATIS");
	
	System.out.println("갯수: " + list.size());
	System.out.println("2번째 과목: " + list.get(2));
	
	list.remove(2);
	
	//int size = list.size();
}
}
