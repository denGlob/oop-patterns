package creationals.prototype;

/**
 * Created by denglob on 8/3/17.
 */
public class PrototypeApp {

    public static void main(String[] args) {
        Human inimitableOriginal = new Human(25, "John");
        System.out.println(inimitableOriginal.toString());
        Human wretchedParody = inimitableOriginal.copy();
        System.out.println(wretchedParody.toString());

        HumanFactory humanFactory = new HumanFactory(wretchedParody);
        Human newHuman = humanFactory.makeCopy();
        System.out.println(newHuman);
    }
}
