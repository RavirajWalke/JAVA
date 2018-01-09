import java.io.*;
 
class CheckedExcp {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        FileReader file = null;
		file = new FileReader("C:\\test1\\a.txt");
		
        BufferedReader fileInput = new BufferedReader(file);
         
        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 4; counter++)
			
		 System.out.println(fileInput.readLine());
			
           fileInput.close();
		
    }
}