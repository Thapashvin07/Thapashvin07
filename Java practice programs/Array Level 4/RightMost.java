import java.util.Scanner;
public class RightMost {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,temp1,temp2,count=1,x,y;
        x=s.nextInt();
        y=s.nextInt();
        for(temp1=x,temp2=y;temp1!=0,temp2!=0;temp1/=2,temp2/=2)
        {
            if(temp1%2==temp2%2)
                count++;
        }
        System.out.println(count);
    }   
}
