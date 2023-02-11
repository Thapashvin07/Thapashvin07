import java.util.Scanner;
public class AlphaComma {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,n,count=0;
        n=sc.nextInt();
        s=sc.next();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(b[i]>='a' && b[i]<='z')
            {    
                b[i]=',';
                count++;
            }
            if(count==n-1)
                break;
        }
        System.out.println(b);
    }
}
