package creationals.factory_method;

/**
 * Created by denglob on 8/2/17.
 */
public class DigitalWatchMaker implements WatchMaker{
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
