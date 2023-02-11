import java.util.Scanner;
public class Equal {
    public static void main(String arg[])
    {
        String s;
        int n,i;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        n=sc.nextInt();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        if(s.length()%n==0)
        {
            for(i=0;i<s.length();i++)
            {
                System.out.print(b[i]);
                if((i+1)%n==0)
                    System.out.print(" ");
            }
        }
        else
            System.out.println("-1");
    }
}
