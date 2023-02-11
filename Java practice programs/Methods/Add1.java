import java.util.Scanner;
public class Add1 {
    public void addition(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        Add1 ob=new Add1();
        ob.addition(a,b);
    }
}
