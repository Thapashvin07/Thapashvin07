import java.util.Scanner;
public class Consecutive {
    public static void main(String arg[])
    {
        String s;
        int i,j;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length()-1;i++)   
        {
            for(j=b[i]+1;j<b[i+1];j++)
                System.out.print((char)j);
        }
    }
}
