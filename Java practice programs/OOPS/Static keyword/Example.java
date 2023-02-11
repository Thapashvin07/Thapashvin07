public class Example {
    static class X
    {
        static String str ="Inside Class X";
    }    
    public static void main(String []arg)
    {
        X.str="Inside Class Example";
        System.out.println("String stored in str is:"+X.str);
    }
}
