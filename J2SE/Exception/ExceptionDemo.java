import java.util.*;
class ExceptionDemo{
public static void main(String args[]){
int j;   
    System.out.println("enter any number");
    while(true)
    {
    try{
        Scanner s=new Scanner(System.in);
      j=s.nextInt();
     }
    catch(Exception e){
        System.out.print("enter correct input");
        continue;
    }
    System.out.println("you entered correct input");
    break;
    }
    
 
}
}
