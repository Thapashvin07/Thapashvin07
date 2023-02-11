import java.util.Scanner;
public class FLXChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        String s;
        s=sc.next();
        x=sc.nextInt();
        System.out.print(s.charAt(x-1)+""+s.charAt(s.length()-x));
    }
}
