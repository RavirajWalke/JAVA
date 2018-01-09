import java.lang.Math;
class Trigonometry
{
public static void main(String args[]){
float ar[]=new float[1000];
int i,j=1;
float s,c;
final float PI=3.1415926535897932384626433832795F ;
for(i=0;i<=360;i=i+10)
{
   ar[j]=i*PI/180;
   s=(float) Math.sin(ar[j]);
  
   c=(float) Math.cos(ar[j]);
   System.out.println(j+"  sin("+i+")="+s+"  cos("+i+")="+c);
   j++;
}
}
}