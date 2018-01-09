import java.io.*;
public class FileDemo {

	public static void main(String[] args) throws IOException {
	FileOutputStream fout=new FileOutputStream("Shahaji.txt");
	char c[]={'1','1','1','1','1','1','1','1','1','1'};
	String s = null;
	byte[] a=s.getBytes();
	fout.write(a);
	System.out.println("File created");
	 FileInputStream  fin=new FileInputStream("Shahaji.txt");
	 int i=0,sum=0;
	 
	 while((i=fin.read())!=-1){
		 System.out.println("i="+i);
	 }
		 for(i=0;i<10;i++){
			 sum=sum+i;
		 }
	System.out.println("Sum="+sum);
	fin.close();
	
	}

}
