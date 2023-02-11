package OOPS.Abstraction;

abstract class Bike
{
    abstract void run();
    abstract void stop();
}
class Splendor extends Bike
{
    void run()
    {
        System.out.println("Bike is running successfully");
    }
    void stop()
    {
        System.out.println("Bike is stopped");
    }
    void off()
    {
        System.out.println("Bike is off");
    }
}
public class AbstractEx {
    public static void main(String arg[])
    {
        Splendor obj=new Splendor();
        obj.run();
        obj.stop();
        System.out.println(obj);
    }
}
