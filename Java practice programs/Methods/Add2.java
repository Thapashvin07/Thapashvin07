import java.util.Scanner;
public class Add2 {
    public int addition(int a, int b)
    {
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        Add2 ob=new Add2();
        int res=ob.addition(a,b);
        System.out.println(res);
    }
}
