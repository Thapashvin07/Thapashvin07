import java.util.Scanner;
public class FLXChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        int x,i;
        s1=sc.next();
        s2=sc.next();
        x=sc.nextInt();
        for(i=0;i<x;i++)
            System.out.print(s1.charAt(i));
        for(i=s2.length()-x;i<s2.length();i++)
            System.out.print(s2.charAt(i));
    }
}
