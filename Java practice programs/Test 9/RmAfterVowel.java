import java.util.Scanner;
public class RmAfterVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));;
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                i++;
        }
    }
}
