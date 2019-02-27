public class Context {
    private EncrytionDecryptionStrategy strategy;

    public void setCompressionStrategy(EncrytionDecryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String word, String key) {
        return strategy.encryptString(word, key);
    }

    public String decrypt(String word, String key) {
        return strategy.decryptString(word, key);
    }
}