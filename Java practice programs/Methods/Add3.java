import java.util.Scanner;
public class Add3 {
    public int addition()
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Add3 ob=new Add3();
        int res=ob.addition();
        System.out.println(res);
    }
}
