import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch1,ch2;
        ch1=s.next().charAt(0);
        ch2=s.next().charAt(0);
        int i;
        for(i=ch1;i<=ch2;i++)
            System.out.print((int)i+" ");
    }
}
