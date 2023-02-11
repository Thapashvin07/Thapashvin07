import java.util.Scanner;
public class FLConsonant {
    public static void main(String arg[])
    {
        String s;
        int i,j,start=0,end=0;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(!(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'))
            {
                start=i;
                break;
            }
        }
        for(i=s.length()-1;i>=0;i--)
        {
            if(!(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'))
            {
                end=i;
                break;
            }
        }
        for(i=0;i<start;i++)
            System.out.print(b[i]);
        for(i=end;i>=start;i--)
            System.out.print(b[i]);
        for(i=end+1;i<s.length();i++)
            System.out.print(b[i]);
    }
}
