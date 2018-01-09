public class ExecDemo
{
    public static void main(String[] args)
    {
       Runtime r=Runtime.getRuntime();
       Process p=null;
       try{
          p= r.exec("notepad");
          p.waitFor();
          p.destroy();
       }
       catch(Exception e){
           System.out.println("error in executing program");
       }
        System.out.println(p.exitValue());
    }
}
