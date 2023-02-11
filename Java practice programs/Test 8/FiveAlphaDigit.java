import java.util.Scanner;
public class FiveAlphaDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        int count=0,i,j;
        for(i=0;i<s.length();i+=5,count++)
        {
            if(count%2==0)
            {
                for(j=i;j<i+5;j++)
                {
                    if(!(s.charAt(j)>64 && s.charAt(j)<123))
                        break;
                }
                if(j!=i+5)
                {
                    System.out.println("NO");
                    break;
                }
            }
            else
            {
                for(j=i;j<i+5;j++)
                {
                    if(!(s.charAt(j)>47 && s.charAt(j)<58))
                        break;
                }
                if(j!=i+5)
                {
                    System.out.println("NO");
                    break;
                }
            }
        }
        if(i==s.length())
                System.out.println("YES");
    }
}
