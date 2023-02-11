import java.util.Scanner;
public class FirstCh {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        String s;
        s=sc.nextLine();
        System.out.print(s.charAt(0));
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                System.out.print(s.charAt(i+1));
        }
    }
}
