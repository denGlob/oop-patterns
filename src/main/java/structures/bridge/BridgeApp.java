package structures.bridge;

/**
 * Created by denglob on 8/10/17.
 */
public class BridgeApp {
    public static void main(String[] args) {
        Car hatchback = new Hatchback(new Kia());
        hatchback.showDetails();
        hatchback = new Hatchback(new Shkoda());
        hatchback.showDetails();

        Car sedan = new Sedan(new Kia());
        sedan.showDetails();
        sedan = new Hatchback(new Shkoda());
        sedan.showDetails();
    }
}

interface Make {
    void setMake();
}
abstract class Car {
    Make make;

    public Car(Make make) {
        this.make = make;
    }

    abstract void showType();

    void showDetails() {
        showType();
        make.setMake();
    }
}

class Sedan extends Car {
    public Sedan(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.println("Sedan");
    }
}

class Hatchback extends Car {
    public Hatchback(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.println("Hatchback");
    }
}

class Kia implements Make {
    @Override
    public void setMake() {
        System.out.println("Kia");
    }
}

class Shkoda implements Make {
    @Override
    public void setMake() {
        System.out.println("Shkoda");
    }
}
