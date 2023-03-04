package FileHandlingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilehandlingDemo {
public static void main(String[] args) {
//	FileInputStream();
	FileOutputStream();
}
static void FileInputStream() {
	File hello=new File("C:/Users/manjoshi/Desktop/hello.txt");
	try {
		FileInputStream fis=new FileInputStream(hello);
		System.out.println("File opened");
		System.out.println("------");
		int i;
		try {
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		System.out.println("Exception occured"+e.getMessage());
	}
}
static void FileOutputStream() {
	File hello=new File("C:/Users/manjoshi/Desktop/hello.txt");
	try {
		java.io.FileOutputStream fos=new FileOutputStream(hello);
		System.out.println("File opened");
		System.out.println("------");
		int i;
		try {
			String data = "good morning";
			byte[] dataByteArray = data.getBytes();
			fos.write(dataByteArray);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		System.out.println("Exception occured"+e.getMessage());
	}
}
}
