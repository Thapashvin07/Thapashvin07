import java.util.Scanner;
public class RevX {
    public static void main(String arg[])
    {
        String s;
        int x,i;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        x=sc.nextInt();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length()-x;i++)
            System.out.print(b[i]);
        for(i=s.length()-1;i>=s.length()-x;i--)
            System.out.print(b[i]);
    }
}
