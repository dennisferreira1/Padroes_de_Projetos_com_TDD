
public class FileLogger1 {

	private static FileLogger1 logger = null;
	
	private FileLogger1() {
		
	}
	
	public static FileLogger1 getFileLogger1() {
		if(logger == null)
			logger = new FileLogger1();
			
		return logger;
	}
	
	public void log(String msg) {
		System.out.println("Registrado no log: " + msg);
	}
}
