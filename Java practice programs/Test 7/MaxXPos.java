import java.util.Scanner;
public class MaxXPos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,x,i,max_digit=0,val=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        x=s.nextInt();
        for(i=0;i<n;i++)
        {
            if((a[i]/(int)Math.pow(10,x-1))%10>max_digit){
                max_digit=(a[i]/(int)Math.pow(10,x-1))%10;
                val=a[i];
            }
        }
        System.out.println(val);
    }
}
