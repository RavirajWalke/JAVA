class DeleteDemo{  
public static void main(String args[]){  
  
StringBuffer sb=new StringBuffer("Hello");  
sb.deleteCharAt(0);
System.out.println(sb);

sb.delete(1,2);  
System.out.println(sb);
}  
}  