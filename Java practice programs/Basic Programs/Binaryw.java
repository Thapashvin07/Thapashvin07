import java.util.Scanner;
public class Binaryw {
    public static void main(String[] args) {
        int i=0,n,temp,j;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[]a=new int[20];
        temp=n;
        while(temp!=0)
        {
            a[i]=temp%2;
            temp/=2;
            i++;
        }
        for(j=i-1;j>=0;j--)
            System.out.print(a[j]);
    }
}
