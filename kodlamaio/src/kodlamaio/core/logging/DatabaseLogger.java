package kodlamaio.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
	      System.out.println("Veri Tabanına loglandı : " + data);		
	}

}
