import java.util.Scanner;
public class ToggleRev {
    public static void main(String arg[])
    {
        String s;
        int i,x;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        x=sc.nextInt();
        char a[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            a[i]=s.charAt(i);
        for(i=x-1;i>=0;i--)
        {
            if(a[i]>96)
                a[i]-=32;
            else
                a[i]+=32;
            System.out.print((char)a[i]);
        }
    }
}
