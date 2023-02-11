import java.util.Scanner;
public class AllVowels {
    public static void main(String arg[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        int flag_a=0,flag_e=0,flag_i=0,flag_o=0,flag_u=0,i;
        s=sc.next();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(b[i]=='a')
                flag_a=1;
            if(b[i]=='e')
                flag_e=1;
            if(b[i]=='i')
                flag_i=1;
            if(b[i]=='o')
                flag_o=1;
            if(b[i]=='u')
                flag_u=1;
        }
        if(flag_a==1&&flag_e==1&&flag_i==1&&flag_o==1&&flag_u==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
