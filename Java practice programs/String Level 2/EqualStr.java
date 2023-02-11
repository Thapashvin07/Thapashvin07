import java.util.Scanner;
public class EqualStr {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,pos;
        s=sc.next();
        if(s.length()%2==0)
            pos=s.length()/2;
        else        
            pos=s.length()/2+1;
        for(i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(pos+i))
                break;
        }
        if(i==s.length()/2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
