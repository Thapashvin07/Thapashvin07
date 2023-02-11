import java.util.Scanner;
public class SameDigit {
    public static void main(String[] args)
    {
        int n1,n2,temp,u_digit,t_digit;
        Scanner s = new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        u_digit=n2%10;
        t_digit=n2/10;
        temp=n1;
        while(temp!=0)
        {
            if(u_digit==temp%10||t_digit==temp%10)
                break;
            temp/=10;
        }
        if(temp==0)
            System.out.println("Invalid");
        else
            System.out.println("Valid");

    }
}
