import java.util.Scanner;
public class CharHash {
    public static void main(String arg[])
    {
        String s;
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();)
        {
            if(b[i]=='#')
            {
                for(j=i+1;j<s.length();j++)
                {
                    if(b[j]=='#')
                        break;
                }
                if(j<s.length())
                {
                    for(k=i+1;k<j;k++)
                        System.out.print(b[k]);
                }
                i=j;
            }
            else
                i++;
        }
    }
}
