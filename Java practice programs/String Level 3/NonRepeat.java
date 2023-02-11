import java.util.Scanner;
public class NonRepeat {
    public static void main(String arg[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int i,j;
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            for(j=0;j<s.length();j++)
            {
                if(b[i]==b[j] && j!=i)
                    break;
            }
            if(j==s.length())
                System.out.print(b[i]);
        }

    }
}
