package creationals.abstract_factory.devices.ua;

import creationals.abstract_factory.basic.Mouse;

/**
 * Created by denglob on 8/2/17.
 */
public class UaMouse implements Mouse{
    public void click() {
        System.out.println("Клацнули мишкою");
    }

    public void doubleClick() {
        System.out.println("Подвіине натискання мишкою");
    }

    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Рух мишкою вгору");
        else if (direction < 0)
            System.out.println("Рух мишкою вниз");
        else
            System.out.println("Мишкою не рухаємо");
    }
}
