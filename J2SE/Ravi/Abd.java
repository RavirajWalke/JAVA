class Abd
{
    static void division() throws ArithmeticException
    {
        int a=2,b=0,c;
        c=a/b;
        
    }
    public static void main(String args[])
    {
        try{
            division();
        }
        catch(ArithmeticException e)
        {
            System.out.println("caught Exception "+e);  
        }
    }
}