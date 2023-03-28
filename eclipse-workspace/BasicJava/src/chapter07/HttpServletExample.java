package chapter07;

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	public static void method(HttpServelet servelet) {
		servelet.service();
	}
}
