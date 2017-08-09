package structures.decorate;

/**
 * Created by denglob on 8/9/17.
 */
public abstract class Decorator implements PrinterInterface{

    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        component.print();
    }
}


