package FileHandlingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilehandlingDemo {
public static void main(String[] args) {
//	FileInputStream();
//	FileOutputStream();
//	FileReader();
//	FileWriter();
	BufferedReader();
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
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		System.out.println("Exception occured"+e.getMessage());
	}
}
static void FileReader() {
	File hello=new File("C:/Users/manjoshi/Desktop/hello.txt");
	try {
		java.io.FileReader fr=new java.io.FileReader(hello);
		System.out.println("File opened");
		System.out.println("------");
		int i;
		try {
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		System.out.println("Exception occured"+e.getMessage());
	}
}
static void FileWriter() {
	File hello=new File("C:/Users/manjoshi/Desktop/hello.txt");
	try {
		java.io.FileWriter fw=new FileWriter(hello);
		System.out.println("File opened");
		System.out.println("------");
		    fw.write("using file writer\n");
		    fw.write("Another line");
			fw.close();
		} catch (FileNotFoundException e) {
		System.out.println("Exception occured"+e.getMessage());
	}catch (IOException e) {
	e.printStackTrace();
}
}
static void BufferedReader() {
	File hello=new File("C:/Users/manjoshi/Desktop/hello.txt");
	try {
		java.io.FileReader fr=new java.io.FileReader(hello);
		java.io.BufferedReader br=new java.io.BufferedReader(fr);
		System.out.println("File opened");
		System.out.println("------");
		String line;;
		try {
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		System.out.println("Exception occured"+e.getMessage());
	}
}
}
