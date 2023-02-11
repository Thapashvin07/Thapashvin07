import java.util.Scanner; 
public class SmallKDIgInt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,k,i,temp,count=0,min=0,flag=0;
        n=s.nextInt();
        k=s.nextInt();
        int a[]=new int [n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<a.length;i++)
        {
            count=0;
            for(temp=a[i];temp!=0;temp/=10)
            {
                    count++;
            }
            if(flag==0 && count==k)
            {
                min=a[i];
                flag=1;
            }
            if(count==k && a[i]<min)
                min=a[i];
        }
        if(min!=0)
            System.out.print(min);
        else
            System.out.println("-1");
    }
}
