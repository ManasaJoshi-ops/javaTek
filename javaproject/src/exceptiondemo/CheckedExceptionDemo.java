package exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

public class CheckedExceptionDemo 
	{
		public static void main(String args[]) {
			try {
				checkedException();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		private static void checkedException() throws FileNotFoundException {
			FileInputStream fis=new FileInputStream("/Users/manjoshi/Desktop/hello");
		}
	
}

