import java.util.Scanner;
public class ToggleAlt {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i;
        s=sc.next();
        char a[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            a[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                if(a[i]<97)
                    a[i]+=32;
                else
                    a[i]-=32;
            }
        }
    System.out.println(a);
    }
}
