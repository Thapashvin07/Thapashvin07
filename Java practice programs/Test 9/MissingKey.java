import java.util.Scanner;
public class MissingKey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        int i,j;
        for(i=0;i<26;i++)
        {
            for(j=0;j<s.length();j++)
            {
            if(s.charAt(j)==i+97)
                break;
            }
            if(j==s.length())
                System.out.print((char)(i+97));
        }
    }
}
