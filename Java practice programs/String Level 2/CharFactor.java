import java.util.Scanner;
public class CharFactor {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int l=0,i;
        s=sc.next();
        l=s.length();
        for(i=0;i<s.length();i++)
        {
            if(l%(i+1) == 0)
                System.out.print(s.charAt(i));
        }
    }
}
