package log;

public class LoggerTester {
	public static void main(String[] args) {
		EventLogger lo = new EventLogger("log.txt");
		lo.log("test");
	}
}
