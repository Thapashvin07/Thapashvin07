import java.util.Scanner;
public class NPos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,n;
        s=sc.next();
        n=sc.nextInt();
        char a[]=new char[s.length()];
        for(i=0;i<s.length();i++)
        {
            if(!((i+1)%n==0))
                System.out.print(s.charAt(i));
        }
    }
}
