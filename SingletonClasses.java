class SingletonClasses {
    public class DummyClass {
        int i_;

        public int get() {
            return i_;
        }

        public void set(int i) {
            i_ = i;
        }
    }
    public static class DummyClassStatic {
        int i_;

        public int get() {
            return i_;
        }

        public void set(int i) {
            i_ = i;
        }
    }
    static class SingletonA {
        // this is thread safe
        private static SingletonA instance_;

        private SingletonA() {
        }

        int i_;

        public int get() {
            return i_;
        }

        public void set(int i) {
            i_ = i;
        }

        public static synchronized SingletonA getInstance() {
            if (instance_ == null) {
                instance_ = new SingletonA();
            }
            return instance_;
        }
    }
    static class SingletonB {
        // this is thread safe
        private static class Wrapper {
            static SingletonB instance_ = new SingletonB();
        }

        private SingletonB() {
        }

        public static SingletonB getInstance() {
            return Wrapper.instance_;
        }
    }
    static class SingletonC {
        // double checked locking thread safe
        // synchronized(SingletonC.class) ensures only one instance of
        // singleton class is created
        private static SingletonC instance_;

        private SingletonC() {
        }

        public static SingletonC getInstance() {
            if (instance_ == null) {
                synchronized (SingletonC.class) {
                    instance_ = new SingletonC();
                }
            }
            return instance_;
        }
    }
    static class SingletonD {
        // not thread safe, lazy initialization
        private static SingletonD instance_;

        private SingletonD() {
        }

        public static SingletonD getInstance() {
            if (instance_ == null) {
                instance_ = new SingletonD();
            }
            return instance_;
        }
    }
    static class SingletonE {
        // not thread safe, eager initialization
        private static SingletonE instance_ = new SingletonE();

        private SingletonE() {
        }

        public static SingletonE getInstance() {
            return instance_;
        }
    }
    static class SingletonF {
        // exception safe eager initialization, not thread safe
        private static SingletonF instance_;

        private SingletonF() {
        }

        static {
            try {
                instance_ = new SingletonF();
            } catch (Exception e) {
            }
        }

        public static SingletonF getInstance() {
            return instance_;
        }
    }
    static class SingletonG {
        // thread safe, different from SingletonE because of final,
        // and created at class load time.
        private static final SingletonG instance_ = new SingletonG();

        private SingletonG() {
        }

        public static SingletonG getInstance() {
            return instance_;
        }
    }
    class SingletonTests {
        public void t1() {
            SingletonA a = SingletonA.getInstance();
            SingletonB b = SingletonB.getInstance();
            if (a != null) {

            }
            if (b != null) {

            }
        }

        public void test() {

        }
    }
    public void test() {
    }
}
