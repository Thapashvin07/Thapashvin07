import java.util.Scanner;
public class UniqueInt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,i,j,temp,count=0,flag=0;
        x=s.nextInt();
        y=s.nextInt();
        for(i=x;i<=y;i++)
        {
            for(j=i;j!=0;j/=10)
            {
                count=0;
                for(temp=i;temp!=0;temp/=10)
                {
                    if(j%10==temp%10)
                        count++;
                }
                if(count>1)
                        break;
            }
            if(count==1)
            {
                System.out.print(i+" ");
                flag=1;
            }
        }
        if(flag==0)
            System.out.println(-1);
    }
}
