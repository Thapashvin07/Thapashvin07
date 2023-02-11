public class RailFence {
    public static String encode(String msg,int depth)
    {
        int r=depth;
        int l=msg.length();
        int c=l/r;
        int k=0;
        int i,j;
        String enc="";
        char [][]mat=new char[r][c];
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                if(k!=l)
                    mat[j][i]=msg.charAt(k++);
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
                enc+=mat[i][j];
        }
        return enc;
    }
    public static String decode(String msg,int depth)
    {
        int r=depth;
        int l=msg.length();
        int c=l/r;
        int k=0;
        int i,j;
        String dec="";
        char [][]mat=new char[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                mat[i][j]=msg.charAt(k++);
            }
        }
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
                dec+=mat[j][i];
        }
        return dec;
    }
    public static void main(String arg[])
    {
        String msg="AnnaUniversity";
        int depth=2;
        System.out.println("---Simulating Rail Fence Cipher---");
        System.out.println("Message is:"+msg);
        String enc_msg=encode(msg,depth);
        String dec_msg=decode(enc_msg,depth);
        System.out.println("Encrypted Message:"+enc_msg);
        System.out.println("Encrypted Message:"+dec_msg);
    }
}
