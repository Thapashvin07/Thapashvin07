import java.util.Scanner;
public class Replace {
    public static void main(String arg[])
    {
        String s;
        char ch1,ch2;
        int i;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        ch1=sc.next().charAt(0);
        ch2=sc.next().charAt(0);
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(b[i]==ch1)
                b[i]=ch2;
        }
        System.out.println(b);
    }
}
