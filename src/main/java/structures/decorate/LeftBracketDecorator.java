package structures.decorate;

/**
 * Created by denglob on 8/9/17.
 */
public class LeftBracketDecorator extends Decorator{

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }
}
