package creationals.abstract_factory.basic;

/**
 * Created by denglob on 8/2/17.
 */
public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
