package creationals.abstract_factory.devices.en;

import creationals.abstract_factory.basic.Mouse;

/**
 * Created by denglob on 8/2/17.
 */
public class EnMouse implements Mouse{
    public void click() {
        System.out.println("Mouse click");
    }

    public void doubleClick() {
        System.out.println("Double mouse click");
    }

    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Moving mouse up");
        else if (direction < 0)
            System.out.println("Moving mouse down");
        else
            System.out.println("Mouse don't moving");
    }
}
