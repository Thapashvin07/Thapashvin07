import java.util.Scanner;
public class VegShop {
    public static void main(String args[])
    {
        int a,b,c,d,x,total;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        x=s.nextInt();
        total=a+b*2+c*5+d*10;
        if(total==x)
            System.out.println("Paid");
        else if(total>x)
            System.out.println("Paid"+" "+(total-x));
        else
            System.out.println("Not Paid"+" "+total);
    }
}
