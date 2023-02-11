import java.util.Scanner;
public class FirstAlpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        char ch;
        s=sc.next();
        ch=s.charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<ch)
                ch=s.charAt(i);
        }
        System.out.println(ch);
    }
}
