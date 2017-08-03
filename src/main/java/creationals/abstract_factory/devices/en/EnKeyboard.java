package creationals.abstract_factory.devices.en;

import creationals.abstract_factory.basic.Keyboard;

/**
 * Created by denglob on 8/3/17.
 */
public class EnKeyboard implements Keyboard{
    public void print() {
        System.out.println("Print a line");
    }

    public void println() {
        System.out.println("Print a line with a translation into another line");
    }
}
