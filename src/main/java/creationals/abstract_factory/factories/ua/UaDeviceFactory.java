package creationals.abstract_factory.factories.ua;

import creationals.abstract_factory.basic.DeviceFactory;
import creationals.abstract_factory.basic.Keyboard;
import creationals.abstract_factory.basic.Mouse;
import creationals.abstract_factory.basic.Touchpad;
import creationals.abstract_factory.devices.ua.UaKeyboard;
import creationals.abstract_factory.devices.ua.UaMouse;
import creationals.abstract_factory.devices.ua.UaTouchpad;

/**
 * Created by denglob on 8/3/17.
 */
public class UaDeviceFactory implements DeviceFactory{
    public Mouse getMouse() {
        return new UaMouse();
    }

    public Keyboard getKeyboard() {
        return new UaKeyboard();
    }

    public Touchpad getTouchpad() {
        return new UaTouchpad();
    }
}
