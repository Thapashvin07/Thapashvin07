public class Diffie {
    public static void main(String arg[])
    {
        int q,alpha,Xa,Xb,Ya,Yb,K1,K2;
        q=11;
        alpha=2;
        Xa=15;
        Xb=14;
        Ya=(int)(Math.pow(alpha,Xa))%q;
        Yb=(int)(Math.pow(alpha,Xb))%q;
        System.out.println("Calculating Public Components......"+Ya+","+Yb);
        K1=(int)(Math.pow(Xa, Yb))%q;
        K2=(int)(Math.pow(Xb, Ya))%q;
        System.out.println("Generating Key.......");
        System.out.println("Exchanging Key......");
        if(K1==K2)
            System.out.println("Key exchanged successfully!");
        else
            System.out.println("Key exchange unsuccessfull///");
    }
}
