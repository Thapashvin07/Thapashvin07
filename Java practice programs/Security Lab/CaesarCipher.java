import java.util.Scanner;
class CaesarCipher {
 public static String encode(String enc, int offset) {
 offset = offset % 26;
 StringBuilder encoded = new StringBuilder();
 for (char i : enc.toCharArray()) {
 if (Character.isLetter(i)) {
 	if (Character.isUpperCase(i)) {
		encoded.append((char) ('A' + (i - 'A' + offset) % 26));
 	} 
 	else {
 		encoded.append((char) ('a' + (i - 'a' + offset) % 26));
 	}
 } 
 else {
 	encoded.append(i);
 }
 }
 return encoded.toString();
 }

 public static String decode(String enc, int offset) {
 return encode(enc, 26 - offset);
 }
 public static void main(String[] args) throws java.lang.Exception {
 String msg;
 Scanner sc=new Scanner(System.in);
 msg=sc.next();
 sc.close();
 int offset = 3;
 System.out.println("---Simulating Caesar Cipher---");
 System.out.println("Input : " + msg);
 String enc_msg=encode(msg, 3);
 System.out.println("Encrypted Message : "+enc_msg);
 System.out.println("Decrypted Message : "+decode(enc_msg, 3));
 }
}
