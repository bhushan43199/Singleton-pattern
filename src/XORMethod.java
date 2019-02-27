
public class XORMethod implements EncrytionDecryptionStrategy {

    @Override
    public String encryptString(String word, String key) {
        String strData = "";
        for (int incr = 0; incr < word.length(); incr++) {
            strData += (char) (word.charAt(incr) ^ key.charAt(incr));
        }
        return strData;

    }

    @Override
    public String decryptString(String encword, String key) {
        String strData="";
        for (int incr = 0; incr < encword.length(); incr++) {
            strData += (char)(encword.charAt(incr) ^ key.charAt(incr));
        }
        return strData;
    }

}
