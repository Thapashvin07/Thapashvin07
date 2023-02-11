import java.util.Scanner;
public class AlphaDigitSum {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,sum=0;
        s=sc.next();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)>64 && s.charAt(i)<123)
                System.out.print(s.charAt(i));
            else
                sum+=(int)(s.charAt(i)-48);
        }
        System.out.print(sum);
    }
}
