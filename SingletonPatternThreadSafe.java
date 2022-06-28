
    public class SingletonPatternThreadSafe {

        private static volatile SingletonPatternThreadSafe instance;

        private SingletonPatternThreadSafe() {
        }

        public static SingletonPatternThreadSafe getInstance() {
            if (instance == null) {
                synchronized (SingletonPatternThreadSafe.class) {
                        instance = new SingletonPatternThreadSafe();
                }
            }
            return instance;
        }

        public static void main(String[] args) {
            SingletonPatternThreadSafe example1 = SingletonPatternThreadSafe.getInstance();
            SingletonPatternThreadSafe example2 = SingletonPatternThreadSafe.getInstance();
            System.out.println(example1);
            System.out.println(example2);
            System.out.println(example1 ==example2);
        }
    }

