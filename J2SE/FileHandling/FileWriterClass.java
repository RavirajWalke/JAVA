
import java.io.*;

public class FileWriterClass {
public static void main(String[] args) {
try{
//take a String
String str="This is a java book";
//attach file to FileWriter
FileWriter fw=new FileWriter("FileWrite.txt");
System.out.println("file created....");
//read character wise from string and write into FileWriter
for(int i=0; i<str.length();i++)
fw.write(str.charAt(i));
//flush before closing
fw.flush();
//close the file
fw.close();
}catch(IOException e){
System.out.println("IOException"+e.toString());
}
}
}


