package creationals.abstract_factory.devices.ua;

import creationals.abstract_factory.basic.Touchpad;

/**
 * Created by denglob on 8/3/17.
 */
public class UaTouchpad implements Touchpad {
    public void track(int deltaX, int deltaY) {
        int delta = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Зсунулись на " + delta + " пікселів");
    }
}
