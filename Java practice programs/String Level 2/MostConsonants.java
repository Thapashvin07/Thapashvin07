import java.util.Scanner;
public class MostConsonants {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int n,i,c1=0,c2=0;
        s=sc.next();
        n=sc.nextInt();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<n;i++)
        {
            if(!(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'))
                c1++;
        }
        for(i=s.length()-n;i<s.length();i++)
        {
            if(!(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'))
                c2++;
        }
        if(c1>c2)
        {
            for(i=0;i<n;i++)
                System.out.print(b[i]);
        }
        else if(c1<c2)
        {
            for(i=s.length()-n;i<s.length();i++)
                System.out.print(b[i]);
        }
        else
            System.out.print(b);
    }
}
