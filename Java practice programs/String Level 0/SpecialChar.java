import java.util.Scanner;

class SpecialChar {
    public static void main(String arg[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        int i, count = 0;
        s = sc.next();
        char b[] = new char[s.length()];
        for (i = 0; i < s.length(); i++)
            b[i] = s.charAt(i);
        for (i = 0; i < s.length(); i++) {
            if (!(b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u'))
                count++;
        }
        System.out.println(s + " has " + count + " special characters");
    }
}