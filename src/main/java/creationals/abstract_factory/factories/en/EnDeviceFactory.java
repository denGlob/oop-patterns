package creationals.abstract_factory.factories.en;

import creationals.abstract_factory.basic.DeviceFactory;
import creationals.abstract_factory.basic.Keyboard;
import creationals.abstract_factory.basic.Mouse;
import creationals.abstract_factory.basic.Touchpad;
import creationals.abstract_factory.devices.en.EnKeyboard;
import creationals.abstract_factory.devices.en.EnMouse;
import creationals.abstract_factory.devices.en.EnTouchpad;

/**
 * Created by denglob on 8/3/17.
 */
public class EnDeviceFactory implements DeviceFactory {
    public Mouse getMouse() {
        return new EnMouse();
    }

    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
