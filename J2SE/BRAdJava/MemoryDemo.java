public class MemoryDemo 
{
    public static void main(String[] args)
    {
        Runtime r=Runtime.getRuntime();
        Integer a[]=new Integer[1000];
        System.out.println(r.totalMemory());
        long mem1,mem2;
        System.out.println(r.freeMemory());
        r.gc();
        mem1=r.freeMemory();
        System.out.println(mem1);
        for(int i=0;i<1000;i++)
            a[i]=new Integer(i);
        mem2=r.freeMemory();
        System.out.println(mem2);
        System.out.println(mem1-mem2);
        for(int i=0;i<1000;i++)
            a[i]=null;
        r.gc();
        mem2=r.freeMemory();
        System.out.println(mem2);
    }
}
