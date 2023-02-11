import java.util.Scanner;
public class ToggleTwo {
    public static void main(String arg[])
    {
        String s1,s2;
        int i;
        Scanner s=new Scanner(System.in);
        s1=s.next();
        s2=s.next();
        char a[]=new char[s1.length()];
        for(i=0;i<s1.length();i++)
            a[i]=s1.charAt(i);
        for(i=0;i<s1.length();i++)
        {
            if(s2.charAt(i)=='u'||s2.charAt(i)=='U')
            {
                if(a[i]>96)
                    a[i]-=32;
            }
            else if(s2.charAt(i)=='l'||s2.charAt(i)=='L')
            {
                if(a[i]<=96)
                    a[i]+=32;
            }
        }
        System.out.print(a);
    }
}
