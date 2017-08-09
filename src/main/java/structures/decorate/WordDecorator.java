package structures.decorate;

/**
 * Created by denglob on 8/9/17.
 */
public class WordDecorator extends Decorator{

    public WordDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
