import java.util.Scanner;
public class StrPattern {
    public static void main(String arg[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int i,j;
        char b[]=new char [s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            for(j=0;j<b[i]-96;j++)
                System.out.print(b[i]);
            System.out.println();
        }
    }
}
