import java.util.*;
import java.math.*;
class BigIntegerDemo
{
	public static void main(String args[])
	{
	  String s1;
	  int i,T;
	  BigInteger N,t,j,P,R;
	  Scanner sc=new Scanner(System.in);
	  T=sc.nextInt();
	  for(i=0;i<T;i++)
	  {
	  	s1=sc.next();
	  	N=new BigInteger(s1);
	  	t=new BigInteger("2");
	  	//j=new BigInteger("2");
	  	while(t.compareTo(N)==-1)
	  	{
	  		if(t.isProbablePrime(1)==true)
	  		{
	  			R=N.remainder(t);
                                if(R.compareTo(BigInteger.ZERO)==0)
                                {
                                    while(true)
                                    {
                                      N=N.divide(t);
                                      if(R.compareTo(BigInteger.ZERO)==0)
                                          continue;
                                      else
                                          break;
                                    }
                                }
	  		}
                        if(N.compareTo(BigInteger.ONE)==0)
                        {
                            System.out.println(t);
                            break;
                        }
                        t.add(BigInteger.ONE);
	  	}
                
	  }
    }
}