import java.util.Scanner;
public class Majority {
    public static void main(String arg[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        int i,v_count=0,c_count=0;
        s=sc.next();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')
                v_count++;
            else
                c_count++;
        }
        if(v_count>c_count)
        {
            for(i=0;i<s.length();i++)
            {
                if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')
                    System.out.print(b[i]);
            }
        }
        else if(v_count<c_count)
        {
            for(i=0;i<s.length();i++)
            {
                if(!(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'))
                    System.out.print(b[i]);
            }
        }
        else
            System.out.print(b);
    }
}
