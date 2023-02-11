import java.util.Scanner;
class CheckAlpha
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,x;    
        s=sc.next();
        x=sc.nextInt();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(b[i]==x+96)  
                break;
        }
        if(i==s.length())
            System.out.println("NO");
        else
            System.out.println("YES");

    }
}