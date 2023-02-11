import java.util.Scanner;
public class MaxVowel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1,s2;
        int c_s1=0,c_s2=0,i;
        s1=s.next();
        s2=s.next();
        for(i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
                c_s1++;
        }
        for(i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
                c_s2++;
        }
        if(c_s1>c_s2)
            System.out.println(s1);
        else if(c_s1<c_s2)
            System.out.println(s2);
        else if(c_s1==c_s2)
            System.out.println(s1);
        else
            System.out.println("-1");
    }
}
