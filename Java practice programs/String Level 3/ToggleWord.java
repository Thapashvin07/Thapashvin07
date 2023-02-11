import java.util.Scanner;
public class ToggleWord {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j,k,flag_a=0,flag_A=0,start=0;
        s=sc.nextLine();
        char a[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            a[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(a[i] ==' ')
            {
                for(j=start;j<i;j++)
                {
                    if(a[j]>96)
                        flag_a=1;
                    else
                        flag_A=1;
                }
                if(flag_a==1 && flag_a==1)
                {
                    for(k=start;k<=i;k++)
                        System.out.print(a[k]);
                }
                else
                {
                    if(flag_a==1)
                    {
                    for(k=start;k<=i;k++)
                        System.out.print((char)a[k]-32);
                    }
                    else if(flag_A==1)
                    {
                    for(k=start;k<=i;k++)
                        System.out.print((char)a[k]+32);
                    }
                }
            }
            start=i+1;
        }
    }
}
