import java.util.Scanner;
public class CircPrint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,n;
        char []ch={'a','b','c','d'};
        n=s.nextInt();
        for(i=0;i<n;i++)
            System.out.print(ch[i%4]);
    }
}
