import java.util.Scanner;
public class ConsVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j,flag=0;
        s=sc.next();
        for(i=0;i<s.length();i++)
        {
            if(!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'))
            {
                
                for(j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
                    {
                        System.out.print(s.charAt(j));
                        flag=1;
                        break;
                    }
                }
                if(j==s.length()&&flag==0)
                {
                    System.out.println("-1");
                    break;
                }
                else if(j==s.length())
                    break;
            }
            else
                    System.out.print(s.charAt(i));
        }
    }
}
