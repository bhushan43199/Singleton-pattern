
public class ROTMethod implements EncrytionDecryptionStrategy {

    @Override
    public String encryptString(String word, String key) {
        String strData = "";
        for (int incr = 0; incr < word.length(); incr++) {
            int rotation = key.charAt(incr) - 0x30;
            int charVal = word.charAt(incr) + 0x4 + rotation;
            strData += (char) (charVal);
        }
        return strData;
    }

    @Override
    public String decryptString(String encword, String key) {
        String strData = "";
        for (int incr = 0; incr < encword.length(); incr++) {
            int rotation = key.charAt(incr) - 0x30;
            int charVal = encword.charAt(incr) - 0x4 - rotation;
            strData += (char) (charVal);
        }
        return strData;

    }

}
