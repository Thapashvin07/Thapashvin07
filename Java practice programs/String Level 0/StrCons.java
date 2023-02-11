import java.util.Scanner;
public class StrCons {
    public static void main(String arg[])
    {
        String s1,s2;
        int c1=0,c2=0,i;
        Scanner s=new Scanner(System.in);
        s1=s.next();
        s2=s.next();
        for(i=0;i<s1.length();i++)
        {
            if(!(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'))
                c1++;
        }
        for(i=0;i<s2.length();i++)
        {
            if(!(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u'))
                c2++;
        }
        if(c1>c2)
            System.out.println(s1);
        else if(c1<c2)
            System.out.println(s2);
        else
        {
            System.out.println(s1.length()>s2.length()?s1:s2);
        }
    }
}
