import java.util.Scanner;
public class SwapVowels {
    public static void main(String arg[])
    {
        int i,j,temp,pos=0;
        String s1,s2;
        Scanner s=new Scanner(System.in);
        s1=s.next();
        s2=s.next();
        char a[]=new char[s1.length()];
        char b[]=new char[s1.length()];
        for(i=0;i<s1.length();i++)
            a[i]=s1.charAt(i);
        for(i=0;i<s2.length();i++)
            b[i]=s2.charAt(i);
        for(i=0;i<s1.length();i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
            {
                for(j=pos;j<s1.length();j++)
                {
                    if(b[j]=='a'||b[j]=='e'||b[j]=='i'||b[j]=='o'||b[j]=='u')
                    {
                        temp=a[i];
                        a[i]=b[j];
                        b[j]=(char)temp;
                        break;
                    }
                }
                pos=j+1;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
