public class MyAssignment {
    private static String xorKey = "Q3d5GH2Z7a5vCg92wFggh3aB12)SPWB673dWS";
    private static String rotKey = "1839572904822247630194753019735135029";
    public static TheSingleton x;
    public static Context context;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        x = TheSingleton.getInstance();
        context = new Context();
        while (true) {
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t6.start();
            t7.start();
            t8.start();
            t9.start();
            t10.start();
            t11.start();
            t12.start();
            t13.start();
            t14.start();
            t15.start();
            t16.start();
        }

    }

    public synchronized static void startEncryptDecrypt() {
        while (true) {
            try {
                String word[] = x.getWord().split(" ");
                if (Integer.parseInt(word[1]) % 2 == 0) {
                    context.setCompressionStrategy(new XORMethod());
                    String enc = context.encrypt(word[0], xorKey);
                    String dec = context.decrypt(enc, xorKey);
                    System.out.println("XOR: Original = [" + word[1] + "]"
                            + word[0] + "; Encrypted = " + enc
                            + "; Decrypted = [" + word[1] + "]" + dec);
                } else {
                    context.setCompressionStrategy(new ROTMethod());
                    String enc = context.encrypt(word[0], rotKey);
                    String dec = context.decrypt(enc, rotKey);
                    System.out.println("ROT: Original = [" + word[1] + "]"
                            + word[0] + "; Encrypted = " + enc
                            + "; Decrypted = [" + word[1] + "]" + dec);

                }

            } catch (Exception e) {
                break;
            }

        }
    }

    //Threads Initialization

    static Thread t1 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t2 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t3 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t4 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t5= new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t6 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t7 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t8 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t9 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t10 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t11 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t12 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t13 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t14 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t15= new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };
    static Thread t16 = new Thread() {
        public void run() {
            startEncryptDecrypt();
        }
    };



}
