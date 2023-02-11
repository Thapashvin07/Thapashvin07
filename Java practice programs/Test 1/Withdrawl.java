import java.util.Scanner;
public class Withdrawl {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int amt,x,y;
        amt=s.nextInt();
        x=s.nextInt();
        y=s.nextInt();
        System.out.println(amt/(x+y));
    }
}
