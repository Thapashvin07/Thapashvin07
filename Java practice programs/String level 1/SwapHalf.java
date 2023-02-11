import java.util.Scanner;
public class SwapHalf {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i;
        s=sc.next();
        for(i=s.length()/2;i<s.length();i++)
            System.out.print(s.charAt(i));
        for(i=0;i<s.length()/2;i++)
            System.out.print(s.charAt(i));
    }
}
