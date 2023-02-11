import java.util.Scanner;
public class Equality {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.next();
        s2=sc.next();
        int i,j;
        for(i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
            {
                for(j=0;j<s2.length();j++)
                {
                    if(s1.charAt(i)==s2.charAt(j))
                    {
                        System.out.print(s1.charAt(i));
                        break;
                    }
                }
            }
        }
    }
}
