import java.util.Scanner;
public class ValidExp {
    public static void main(String arg[])
    {
        String s;
        int i;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(!((b[i]=='H' && i%2==0)||(b[i]=='T' && i%2!=0)))
                break;
        }
        if(i==s.length())
            System.out.println("VALID");
        else
            System.out.println("INVALID");
    }
}
