import java.util.Scanner;
public class MulUDigit {
    public static void main(String[] args)
    {
        int i,n,u_digit,mul;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        u_digit=n%10;
        if(u_digit==0)
            mul=10;
        else
            mul=u_digit;
        i=mul;
        while(i<=n)
        {
            System.out.print(i+"\t");
            i=i+mul;
        }
    }
}
