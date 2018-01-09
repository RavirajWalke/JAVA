
public class EvenNumException extends Exception {
    EvenNumException(String s){// constructor of a class
		super (s);
	}

	public static void main(String[] args) {
try{
	int arr[]={2, 4, 6,9};
	int var;
	int i;
	for(i=0;i<arr.length; i++){
		var=arr[i]%2;
		if (var==0){
			System.out.println(arr[i]+""+"is an even number");
		}else{
			EvenNumException exp=new EvenNumException(arr[i]+""+"is not an even number");
			throw exp;
		}
	}
}catch(EvenNumException exp){
	System.out.println(exp);
  }
 }

}
