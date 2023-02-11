import java.util.Scanner;

public class MaxPro {
    public static void main(String arg[]) {
        int i, max, max_2, index=0, n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++)
            a[i] = s.nextInt();
        max = a[0];
        for (i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        if (index == 0)
            max_2 = a[1];
        else
            max_2 = a[0];
        for (i = 0; i < n; i++) {
            if ( a[i] > max_2 && i != index)
                max_2 = a[i];
        }
        System.out.println(max_2*max);
    }
}