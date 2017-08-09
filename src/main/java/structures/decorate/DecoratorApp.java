package structures.decorate;

/**
 * Created by denglob on 8/9/17.
 */
public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printerInterface = new WordDecorator(
                new LeftBracketDecorator(
                        new RightBtacketDecorator(
                                new Word("Hello"))));
        printerInterface.print();
    }
}
