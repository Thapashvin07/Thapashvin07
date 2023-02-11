import java.util.Scanner;
public class RevLastVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j;
        s=sc.next();
        for(i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                break;
        }
        for(j=i-1;j>=0;j--)
            System.out.print(s.charAt(j));
        for(j=i;j<s.length();j++)
            System.out.print(s.charAt(j));
    }
}
