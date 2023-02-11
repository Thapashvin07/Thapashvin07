import java.util.Scanner;
public class FLXInt {
    public static void main(String arg[])
    {
        int i,n,x;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        x=s.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++)
            arr[i]=s.nextInt(); 
        for(i=0;i<x;i++)
        {
            if(arr[i]!=arr[n-x+i])
                break;
        }
        if(i==x)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
