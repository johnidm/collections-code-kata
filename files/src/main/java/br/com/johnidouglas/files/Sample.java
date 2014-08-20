package br.com.johnidouglas.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Sample {

	public static void main(String[] args) throws IOException {

		MethodOne();
		//MethodTwo();
		//MethodTree();
		//MethodFour();
	}

	private static void MethodFour() {
		try (BufferedReader br = new BufferedReader(new FileReader( "C:\\test.txt" ))) {

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void MethodTree() throws IOException {

		File file = new File("C:\\test.txt");

		InputStream is = new FileInputStream(file);
		try {

			int content;
			while ((content = is.read()) != -1) {
				System.out.print((char) content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			is.close();
		}

	}

	private static void MethodTwo() throws IOException {

		File file = new File("C:\\test.txt");

		try (InputStream is = new FileInputStream(file)) {

			int content;
			while ((content = is.read()) != -1) {
				System.out.print((char) content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void MethodOne() {

		try (InputStream is = new FileInputStream("C:\\test.txt");
				OutputStream os = new FileOutputStream("D:\\test.copy.txt")) {
			
			
			int content;
			while ((content = is.read()) != -1) {
				
				os.write( (char) content );
				
				
				
				os.write( "johni".getBytes() );
				
				System.out.print((char) content);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
