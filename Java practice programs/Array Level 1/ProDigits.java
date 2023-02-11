import java.util.Scanner;
public class ProDigits {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,temp,product;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            product=1;
            for(temp=a[i];temp!=0;temp/=10)
                product=product*(temp%10);
            System.out.print(product+"\t");
        }
    }
}
