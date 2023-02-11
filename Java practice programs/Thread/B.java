public class B implements Runnable {
    public void run()
    {
        System.out.println("Hi");
    }
    public static void main(String arg[])
    {
        B ob=new B();
        Thread obj=new Thread(ob);
        obj.start();    
    }
}
