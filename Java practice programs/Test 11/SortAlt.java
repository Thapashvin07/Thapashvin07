import java.util.Scanner;

public class SortAlt {
    void sortAltSubarray(int size, int arr[], int k) {
        int i, j, temp, p;
        for (i = 0; i < size; i += 2 * k) {
            for (j = i; j < i + k; j++) {
                for (p = j + 1; p < i + k; p++) {
                    if (arr[j] > arr[p]) {
                        temp = arr[j];
                        arr[j] = arr[p];
                        arr[p] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int n, k, i;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++)
            a[i] = s.nextInt();
        k = s.nextInt();
        SortAlt obj = new SortAlt();
        obj.sortAltSubarray(n, a, k);
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
