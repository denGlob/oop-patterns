package structures.decorate;

/**
 * Created by denglob on 8/9/17.
 */
public class Word implements PrinterInterface{

    private String value;

    public Word(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
