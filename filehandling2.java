import java.io.*;
public class file2{
public static void main(String[] args)throws IOException{
File file1=new File("smple.fle");
if(file1.exists()) {
System.out.println("FILE EXISTS");
 	}
	else {
		file1.createNewFile();
		System.out.println("FILE CREATED");
		}
		FileWriter fileout=new FileWriter("smple.fle");
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the data:");
		String str=buff.readLine();
		fileout.write(str+" ");
		System.out.println("DATA ADDED");
		fileout.close();
		FileReader fileread=new FileReader("smple.fle");
		BufferedReader file2=new BufferedReader(fileread);
		while((str=file2.readLine())!=null)
		{
			System.out.println(str);
		}
		fileread.close();
	}
}
