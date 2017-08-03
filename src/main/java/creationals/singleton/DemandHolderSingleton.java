package creationals.singleton;

/**
 * Created by denglob on 8/3/17.
 */
public class DemandHolderSingleton {

    public static class DemandHolderSingletonHolder {
        public static final DemandHolderSingleton SINGLETON = new DemandHolderSingleton();
    }

    public static DemandHolderSingleton getInstance() {
        return DemandHolderSingletonHolder.SINGLETON;
    }
}
