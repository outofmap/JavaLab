package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	
	private static String FileName = "log.txt";
	private static String FINE_FILE = "fine.txt";
	private static String WARNING_FILE = "warning.txt";
	private FileHandler fileHandler;
	private FileHandler fineHandler;
	private FileHandler warningHandler;
	
	Logger logger = Logger.getLogger("mylogger"); 
	SimpleFormatter formatter = new SimpleFormatter();
	
	public MyLogger(){
		try{
			fileHandler = new FileHandler(FileName,true);
			fileHandler.setFormatter(formatter);
			
			fineHandler = new FileHandler(FINE_FILE,true);
			warningHandler = new FileHandler(WARNING_FILE,true);
			
			fineHandler.setFormatter(formatter);
			warningHandler.setFormatter(formatter);
			
			
			logger.setLevel(Level.ALL);
			logger.addHandler(fileHandler);
			
			logger.addHandler(fineHandler);
			logger.addHandler(warningHandler);
			
			fineHandler.setLevel(Level.FINE);
			warningHandler.setLevel(Level.WARNING);
			
		}catch(SecurityException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void log(String message){
		
		//logger.setLevel(Level.));
		logger.fine(message);
		logger.warning(message);
	}
	
	public void fine(String message){
		logger.fine(message);
	}
	
	public void warning(String message){
		logger.warning(message);
	}
}
