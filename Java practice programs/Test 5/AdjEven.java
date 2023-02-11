import java.util.Scanner;
public class AdjEven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i=0,j,temp,flag=0;
        n=s.nextInt();
        int a[]=new int[9];
        for(temp=n;temp!=0;temp/=10)
            a[i++]=temp%10;
        if(a[i-2]%2==0){
            System.out.print(a[i-1]);
            flag=1;
        }
        for(j=i-2;j>0;j--)
        {
            if(a[j+1]%2==0 && a[j-1]%2==0){
                System.out.print(a[j]);
                flag=1;
            }
        }
        if(a[1]%2==0)
        {   
            System.out.print(a[0]);
            flag=1;
        }
        if(flag!=1) 
        System.out.println("-1");
    }
}
