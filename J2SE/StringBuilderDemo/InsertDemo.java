class InsertDemo{  
public static void main(String args[]){  
  
StringBuffer sb=new StringBuffer("Hello ");  
sb.insert(3,"Java");//now original string is changed  
System.out.println(sb);
 sb.insert(4, 'a');
 System.out.println(sb);
 
}  
}  