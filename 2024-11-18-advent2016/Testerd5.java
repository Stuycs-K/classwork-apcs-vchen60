import java.security.*;
import java.util.Arrays;

public class Testerd5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String doorId = "uqwqemis";
        //did not read from input
        /*provided code was
         * single line
         */
        System.out.println(codeA(doorId));
        System.out.println(codeB(doorId));
    }


    public static String codeA(String doorId) throws NoSuchAlgorithmException {
      String code = "";
      int i= 0;
      MessageDigest md = MessageDigest.getInstance("MD5");

    while(code.length() < 8) {
          String hashInput = doorId+i;
          byte[] hash = md.digest(hashInput.getBytes());
          String hex = bytesToHex(hash);
            //found md5 hash from online
        if (hex.startsWith("00000")) {
            code += hex.charAt(5);
            
        }
            
        i++;
        }

        return code.toString();
    }


    public static String codeB(String doorId) throws NoSuchAlgorithmException {
        char[] code = new char[8];
        for(int i = 0; i < 8; i++) {
            code[i] = '-';
        }

        int i = 0;
        int n = 0;
        MessageDigest md = MessageDigest.getInstance("MD5");

        while (n < 8) {
            String hashInput = doorId + i;
            byte[] hash = md.digest(hashInput.getBytes());
            String hex = bytesToHex(hash);
              if (hex.startsWith("00000")) {

                char positionChar = hex.charAt(5);
                
                if (Character.isDigit(positionChar)) {
                    int position = Character.getNumericValue(positionChar);
                    
                    if (position >= 0 && position < 8 &&
                code[position] == '-') {
                        code[position] = hex.charAt(6);
                        
                        n++;
                
        }}
    }
            i++;
        }
        String k = "";
        for(int j = 0; j < 8; j++) {
            k+=code[j];
        }
        return k;
    }

    public static String bytesToHex(byte[] B) {
        String result = "";

        for (byte b : B) {

            String hex = Integer.toHexString(0xFF & b);
                if (hex.length() == 1) {
                    result += "0";}
            result += hex;
        }
        return result;
    }
}
