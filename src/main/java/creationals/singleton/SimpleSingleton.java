package creationals.singleton;

/**
 * Created by denglob on 8/3/17.
 */
public class SimpleSingleton {
    private static SimpleSingleton ourInstance;

    public static SimpleSingleton getInstance() {
        if (ourInstance == null) {
            ourInstance = new SimpleSingleton();
        }
        return ourInstance;
    }

    private SimpleSingleton() {
    }
}
