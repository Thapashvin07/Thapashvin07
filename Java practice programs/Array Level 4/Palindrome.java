import java.util.Scanner;
public class Palindrome {
    public int isPalindrome(int n)
    {
        int temp,rev=0;
        for(temp=n;temp!=0;temp/=10)
            rev=rev*10+(temp%10);
        if(rev==n)
            return 1;
        else
            return 0;
    }
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,j,bin=0,result,temp;
        n=s.nextInt();
        int a[]=new int [20];
        Palindrome obj=new Palindrome();
        result=obj.isPalindrome(n);
        if(result!=1)
            System.out.println("NO");
        else
        {
            for(temp=n,i=0;temp!=0;temp/=2,i++)
                a[i]=temp%2;
            for(j=i-1;j>=0;j--)
                bin=bin*10+a[j];
            result=obj.isPalindrome(bin);
            if(result==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
