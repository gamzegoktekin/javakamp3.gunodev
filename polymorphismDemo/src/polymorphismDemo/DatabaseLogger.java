package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	public void Log(String message) {
		System.out.println("Logger to database :" +  message);
}
}