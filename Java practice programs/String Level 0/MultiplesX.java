import java.util.Scanner;
public class MultiplesX {
    public static void main(String arg[])
    {
        String s;
        int i,x;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        x=sc.nextInt();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=s.length()-1;i>=0;i--)
        {
            if((i+1)%x==0)
                System.out.print(b[i]);
        }
    }
}
