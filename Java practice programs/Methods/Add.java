import java.util.Scanner;
public class Add {
    public void addition()
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println(c);
    }
    public static void main(String arg[])
    {
        Add ob=new Add();
        ob.addition();
    }
}
