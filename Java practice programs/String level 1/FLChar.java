import java.util.Scanner;
public class FLChar {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,n;
        s=sc.next();
        n=sc.nextInt();
        for(i=0;i<n;i++)
            System.out.print(s.charAt(i));
        for(i=s.length()-n;i<s.length();i++)
            System.out.print(s.charAt(i));
    }
}
