import java.util.Scanner;
public class Amount {
    public static void main(String[] args) {
        int x, y, z;
        double total, discount;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        total = x + y + z;
        if (x == y && y == z && z == x)
            discount = 0;
        else if (x == y)
            discount = (2 * x * 10) / 100;
        else if (y == z)
            discount = (2 * y * 10) / 100;
        else if (z == x)
            discount = (2 * z * 10) / 100;
        else
            discount = 0;
        System.out.println(total - discount);
    }
}
