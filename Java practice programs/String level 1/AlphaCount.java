import java.util.Scanner;
public class AlphaCount {
    public static void main(String arg[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        int m=0,n=0,i;
        s=sc.next();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(b[i]>='a' && b[i]<='m')
                m++;
            else
                n++;
        }
        if(m>n)
            System.out.println("FIRST HALF");
        else if(m<n)
            System.out.println("SECOND HALF");
        else
            System.out.println("-1");
    }
}
