import java.util.Scanner;
public class SubStrMax {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,max=0,start=0,count=0;
        String s1,s2;
        s1=sc.next();
        s2=sc.next();
        for(i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                if(max<count)
                {
                    max=count;
                    start=i-count;
                }
                count=0;
            }
            else
                count++;
        }
        if(max<count)
        {
            max=count;
            start=i-count;
        }
        for(i=start;i<start+max;i++)
            System.out.print(s1.charAt(i));
    }
}
