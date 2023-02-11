import java.util.Scanner;

public class MulPattern {
    public static void main(String[] args) {
        int i, j, n, x, count = 1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        x = s.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++){
                if (count % x == 0)
                    System.out.print("*" + "\t");
                else
                    System.out.print(count + "\t");
            count++;
            }
            System.out.println();
        }
    }
}
