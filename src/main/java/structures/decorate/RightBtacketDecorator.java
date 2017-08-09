package structures.decorate;

/**
 * Created by denglob on 8/9/17.
 */
public class RightBtacketDecorator extends Decorator{

    public RightBtacketDecorator(PrinterInterface component) {
        super(component);

    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }
}
