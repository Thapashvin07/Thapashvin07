import java.util.Scanner;

public class LowerCount {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int i,j,count=0,start=0;
        for(i=0;i<s.length();i++)
        {
            if(i+1==s.length() || s.charAt(i)==' ')
            {
                for(j=start;j<i;j++)
                {
                    if(!(s.charAt(j)>96))
                        break;
                }
                if(j==i)
                {
                    count++;
                    start=i+1;
                }
                else    
                    start=i+1;
            }
        }
        System.out.println(count);
    }
}
