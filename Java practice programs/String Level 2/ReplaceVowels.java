import java.util.Scanner;
public class ReplaceVowels {
    public static void main(String arg[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        int i,j=0;
        s=sc.next();
        char a[]={'a','e','i','o','u'};
        char b[]=new char [s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')
            {
                b[i]=a[j%5];
                j++;
            }
        }
        System.out.print(b);
    }
}
