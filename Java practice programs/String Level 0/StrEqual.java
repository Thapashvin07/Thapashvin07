import java.util.Scanner;
public class StrEqual
{
    public static void main(String arg[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        int i,count_y=0,count_n=0;
        s=sc.next();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(b[i]=='n')
                count_n++;
            else
                count_y++;
        }
        if(count_y > count_n)
            System.out.println("YES");
        else if(count_y < count_n)
            System.out.println("NO");
        else    
            System.out.println("EQUAL");
    }
}
