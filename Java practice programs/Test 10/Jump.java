import java.util.Scanner;
public class Jump {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,k,dist=0;
        x=s.nextInt();
        y=s.nextInt();
        k=s.nextInt();
        while(k!=0)
        {
            if(k%2!=0)
                dist+=x;
            else
                dist-=y;
            k--;
        }
        System.out.println(dist);
    }
}
