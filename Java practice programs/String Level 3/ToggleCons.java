import java.util.Scanner;
public class ToggleCons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j;
        s=sc.next();
        char a[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            a[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
            {
                for(j=i+1;j<s.length();j++)
                {
                    if(!(a[j]=='a'||a[j]=='e'||a[j]=='j'||a[j]=='o'||a[j]=='u'))
                    {
                        if(a[j]>96)
                            a[j]-=32;
                        else
                            a[j]+=32;
                    }
                }
            }
        }
        System.out.println(a);
    }
}
