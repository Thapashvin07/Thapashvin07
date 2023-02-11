import java.util.Scanner;
public class AlphaDigits {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)>64 && s.charAt(i)<123)
                System.out.print(s.charAt(i));
        }
        for(i=0;i<s.length();i++)
        {
            if(!(s.charAt(i)>64 && s.charAt(i)<123))
                System.out.print(s.charAt(i));
        }
    }    
}
