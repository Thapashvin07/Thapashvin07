import java.util.Scanner;
public class Repeat {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i;
        s=sc.next();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(b[i]==b[i+1] && b[i+1]==b[i+2])
                break;
        }
        if(i==s.length())
            System.out.println("VALID");
        else
            System.out.println("INVALID");
    }
}
