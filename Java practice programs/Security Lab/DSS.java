import java.security.*;
import java.util.Scanner;
public class DSS {
    public static void main(String arg[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        String msg;
        System.out.println("ENter a message:");
        msg=sc.nextLine();
        KeyPairGenerator keypairgen=KeyPairGenerator.getInstance("DSA");
        keypairgen.initialize(2048);
        KeyPair pair=keypairgen.generateKeyPair();
        PrivateKey pvtkey=pair.getPrivate();
        Signature sign=Signature.getInstance("SHA256withDSA");
        sign.initSign(pvtkey);
        byte[] bytes=msg.getBytes();
        sign.update(bytes);
        byte[]signature = sign.sign();
        System.out.println("Digital signature for given text:"+new String(signature,"UTF8"));
    }
}
