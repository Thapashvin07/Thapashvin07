import java.util.Scanner;
public class RepeatCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,max=1,repeat=1;
        String s;
        s=sc.next();
        char a[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            a[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            max=1;
            for(j=i+1;j<s.length();j++)
            {
                if(a[i]==a[j]||a[i]-32==a[j]||a[i]+32==a[j])
                    max++;
            }
            if(max>repeat)
                repeat=max;
        }
        System.out.println(repeat);
    }
}
