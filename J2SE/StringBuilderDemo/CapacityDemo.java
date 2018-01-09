class CapacityDemo{  
public static void main(String args[]){  
  
StringBuffer sb=new StringBuffer();  
System.out.println(sb.capacity()); 
  
sb.append("Hello");  
System.out.println(sb.capacity());

System.out.println("length = " + sb.length());  

sb.append("java is my favourite language");  
System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
}  
}  