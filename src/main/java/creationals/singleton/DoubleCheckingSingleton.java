package creationals.singleton;

/**
 * Created by denglob on 8/3/17.
 */
public class DoubleCheckingSingleton {
    private static volatile DoubleCheckingSingleton singleton;

    public static DoubleCheckingSingleton getInstance() {
        DoubleCheckingSingleton checkingSingleton = singleton;
        if (checkingSingleton == null) {
            synchronized (DoubleCheckingSingleton.class) {
                checkingSingleton = singleton;
                if (checkingSingleton == null) {
                    singleton = checkingSingleton = new DoubleCheckingSingleton();
                }
            }
        }
        return checkingSingleton;
    }
}
