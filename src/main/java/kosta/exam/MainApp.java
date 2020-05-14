package kosta.exam;

public class MainApp {

	public static void main(String[] args) {
		String path = MainApp.class.getClassLoader()
                .getResource("log4j.properties")
                .getFile();
		System.out.println("path: " + path);
		
		System.setProperty("java.util.logging.config.file", path);
		
		LogTest test = new LogTest();
		test.log();	
		
		System.out.println("**파일을 확인해보아요**");
	}

}
