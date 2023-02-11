import java.util.Scanner;

public class ConnectWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int i, k = 0, start = 0, flag = 0;
        s = sc.nextLine();
        char a[] = new char[s.length()];
        for (i = 0; i < s.length(); i++)
            a[i] = s.charAt(i);
        for (i = 0; i < s.length(); i++) 
        {
            if (i+1==s.length() || a[i+1] == ' ') {
                if (flag == 1) {
                    if (!(a[i] == a[start] || a[i] - 32 == a[start] || a[i] + 32 == a[start]))
                            break;
                    start=k;
                    k=i+2;
                    
                } 
                else {
                    flag=1;
                    k=i+2;
                }
            }
        }
        if (i == s.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
