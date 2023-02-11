import java.util.Scanner;
public class Prepend {
    public static void main(String arg[])
    {
        String s;
        char ch;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        ch=sc.next().charAt(0);
        if(s.charAt(0)!=ch)
            System.out.print(ch);
        System.out.print(s);
        if(s.charAt(s.length()-1)!=ch)
            System.out.print(ch);
    }
}
