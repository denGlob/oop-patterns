package structures.adapter;

/**
 * Created by denglob on 8/9/17.
 */
public class AdapterExtendsExampleApp {
    public static void main(String[] args) {
        VectorGraphics g1 = new VectorAdapterFromRaster1();
        g1.drawLine();
        g1.drawSquare();

        VectorGraphics g2 = new VectorAdapterFromRaster2();
        g2.drawLine();
        g2.drawSquare();
    }
}

interface VectorGraphics {
    void drawLine();
    void drawSquare();
}

class RasterGraphic {
    void drawRasterLine() {
        System.out.println("Draw line");
    }

    void drawRasterSquare() {
        System.out.println("Draw square");
    }
}

class VectorAdapterFromRaster1 extends RasterGraphic implements VectorGraphics{
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}

class VectorAdapterFromRaster2 implements VectorGraphics {

    RasterGraphic rasterGraphic = new RasterGraphic();
    @Override
    public void drawLine() {
        rasterGraphic.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphic.drawRasterSquare();
    }
}
