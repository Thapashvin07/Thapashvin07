import javax.crypto.*;

public class DES {
    public static void main(String[] argv) {
        try {
            System.out.println("Message Encryption Using DES Algorithm\n-------");
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();
            Cipher desCipher;
            desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] text = "Secret Information ".getBytes();
            System.out.println("Message [Byte Format] : " + text);
            System.out.println("Message : " + new String(text));
            byte[] textEncrypted = desCipher.doFinal(text);
            System.out.println("Encrypted Message: " + textEncrypted);
            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            byte[] textDecrypted = desCipher.doFinal(textEncrypted);
            System.out.println("Decrypted Message: " + new String(textDecrypted));
        } 
        // catch (NoSuchAlgorithmException e) {
        //     e.printStackTrace();
        // } catch (NoSuchPaddingException e) {
        //     e.printStackTrace();
        // } catch (InvalidKeyException e) {
        //     e.printStackTrace();
        // } catch (IllegalBlockSizeException e) {
        //     e.printStackTrace();
        // } catch (BadPaddingException e) {
        //     e.printStackTrace();
        // }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
