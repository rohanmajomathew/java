import java.io.*;
import java.util.Scanner;
public class file1 {

public static void main(String[] args) {
		try {
			File fin1= new File("file1.txt");
			File fin2=new File("file2.txt");
			if (fin1.exists() && fin2.exists()){
				System.out.println("Files exists");
			}
			else {
				fin1.createNewFile();
				fin2.createNewFile();
			}
			FileOutputStream fout1= new FileOutputStream("file1.txt");
			System.out.println("Enter the Line of Text");
			Scanner sc= new  Scanner(System.in);
			String text= sc.nextLine();
			byte[] txt = text.getBytes();
			fout1.write(txt);
			fout1.close();
			FileInputStream f1 = new FileInputStream("file1.txt");
			byte[] content= f1.readAllBytes();
			f1.close();
			FileOutputStream fout2= new FileOutputStream("file2.txt");
			fout2.write(content);
			fout2.close();
			FileInputStream f2 = new FileInputStream("file2.txt");
			int ch= f2.read();
			System.out.println("Text in New File");

			while (ch!=-1) {
				System.out.print((char)ch);
				ch= f2.read();
			}
			f2.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
