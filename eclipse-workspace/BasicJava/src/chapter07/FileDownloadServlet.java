package chapter07;

public class FileDownloadServlet extends HttpServelet {

	public FileDownloadServlet() {
	}
	@Override
	public void service() {
		System.out.println("파일 다운로드합니다.");
	}
}
