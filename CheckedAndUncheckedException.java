package com.project.java;

/* 
 * Checked Exceptions: are the exceptions that are checked at compile time. 
 * If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.
 */
/*
 * Throwable-> Error{Always Unchecked} & Exceptions{''Checked'' + Runtime Exceptions{Always Unchecked}}
 * Runtime exception and Errors are Unchecked Exceptions, rest you need to handle or have to use throws keyword
 * Unchecked are the exceptions that are not checked at compiled time.
 * 
 * */
import java.io.*;

public class CheckedAndUncheckedException {

	public static void main(String[] args) {
		int x = 0;
		int y = 10;
		int z = y / x;
		/*
		 * This would not throw compile time error as it is a Runtime Exception. 
		 * */
		System.out.println(z);
		
		//need to handle or have to use throws keyword
		//if not then would not compile as it is a checked Exception
		try {
			CheckedAndUncheckedException.fileIO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fileIO() throws IOException{
		FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);
         
        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) 
            System.out.println(fileInput.readLine());
         
        fileInput.close();
	}

}
