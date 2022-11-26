import java.io.*;
public class file1 {
public static void main(String[] args)throws IOException {
File file1=new File("files1.txt");
if(file1.exists()) {
System.out.println("exists");
	}
	else {
		file1.createNewFile();
		System.out.println("File Created");
	    }
		try {
		FileOutputStream fileOut=new FileOutputStream("files1.txt");
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the data:");
		String s=buff.readLine();
		byte []arr=s.getBytes();
		fileOut.write(arr);
		System.out.println("Data Added");
		fileOut.close();
		 }
		 catch(Exception e) {
			 System.out.println("file not found");
		 	}
			int i=0;
			FileInputStream file2=new FileInputStream("files1.txt");
			System.out.println(file2.available());
			while((i=file2.read())!=-1) {
				char c=(char) i;
				System.out.println(c);
				}
				file2.close();
		}
}
