package creationals.abstract_factory;

import creationals.abstract_factory.basic.DeviceFactory;
import creationals.abstract_factory.basic.Keyboard;
import creationals.abstract_factory.basic.Mouse;
import creationals.abstract_factory.basic.Touchpad;
import creationals.abstract_factory.factories.en.EnDeviceFactory;
import creationals.abstract_factory.factories.ua.UaDeviceFactory;

/**
 * Created by denglob on 8/2/17.
 */
public class AbstractFactoryApp {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = getWatchMakerByName("Britain");
        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.getTouchpad();

        mouse.click();
        mouse.doubleClick();
        mouse.scroll(4);

        keyboard.print();
        keyboard.println();

        touchpad.track(3, 5);
    }

    private static DeviceFactory getWatchMakerByName(String country) {
        switch (country) {
            case "Ukraine" :
                return new UaDeviceFactory();
            case "Britain":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Any watch maker plant ((( " + country);
        }
    }
}
