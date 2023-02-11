import java.util.Scanner;
public class Binarydw {
    public static void main(String[] args) {
        int i=0,n,temp,j;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[]a=new int[20];
        temp=n;
        do
        {
            a[i]=temp%2;
            temp/=2;
            i++;
        }while(temp!=0);
        for(j=i-1;j>=0;j--)
            System.out.print(a[j]);
    }
}
