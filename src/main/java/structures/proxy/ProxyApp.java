package structures.proxy;

/**
 * Created by denglob on 8/9/17.
 */
public class ProxyApp {
    public static void main(String[] args) {
        Image image = new ProxyImage("/km/img/png/lol.jpg");
        image.display();
    }
}

interface Image {
    void display();
}

class RealImage implements Image {

    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading ...     " + fileName) ;
    }

    @Override
    public void display() {
        System.out.println("Watching " + fileName);
    }
}

class ProxyImage implements Image {
    String fileName;
    RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
