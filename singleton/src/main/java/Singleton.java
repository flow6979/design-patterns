public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        // no one can create instance of mine from outside.
    }

    public static Singleton getInstance() {
        // Double-Check Locking
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void operate() {
        System.out.println("Hell yeah! Singleton works!");
    }

}