package creationals.abstract_factory.devices.ua;

import creationals.abstract_factory.basic.Keyboard;

/**
 * Created by denglob on 8/3/17.
 */
public class UaKeyboard implements Keyboard{
    public void print() {
        System.out.println("Друкуємо рядок");
    }

    public void println() {
        System.out.println("Друкуємо рядок з переводом на іншии рядок");
    }
}
