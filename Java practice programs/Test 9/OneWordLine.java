import java.util.Scanner;
public class OneWordLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        String s;
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                System.out.println();
            else
                System.out.print(s.charAt(i));

        }
    }
}
