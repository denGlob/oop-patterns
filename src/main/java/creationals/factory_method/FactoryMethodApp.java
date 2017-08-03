package creationals.factory_method;

/**
 * Created by denglob on 8/2/17.
 */
public class FactoryMethodApp {
    public static void main(String[] args) {
        WatchMaker maker = getWatchMakerByName("digital");
        Watch watch = maker.createWatch();
        watch.showTime();
        System.out.println("<------------------------------->");
        maker = getWatchMakerByName("rome");
        watch = maker.createWatch();
        watch.showTime();
        System.out.println("<------------------------------->");
    }

    private static WatchMaker getWatchMakerByName(String name) {
        switch (name) {
            case "digital":
                return new DigitalWatchMaker();
            case "rome":
                return new RomeWatchMaker();
            default:
                throw new RuntimeException("Any watch maker plant ((( " + name);
        }
    }
}
