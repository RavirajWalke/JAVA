class NestedTryClass{  
 public static void main(String args[]){  
  try{  
	 
  try{  
     System.out.println("going to divide");  
     int b =39/0;  
       }
    catch(ArithmeticException e){
    	System.out.println(e);
    	}  
   
    try{  
    int a[]=new int[5];  
    a[5]=4;  
    }
    catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
     
    String s=null;
    System.out.println(s.length());
    System.out.println("other statement");
     
  }catch(Exception e){System.out.println("handeled");}  
  
  System.out.println("normal flow..");  
 }  
}