package task06.t01main.container;

public class CylinderSmallContainer extends Container{

    public int waterMassCylinderSmallContainer = waterMass(super.volume(square(10)));

    @Override
    protected double square(int diagonal) {
        return Math.PI * diagonal * diagonal;
    }

    @Override
    protected int waterMass(double volume) {
        return (int) Math.round(volume * super.waterDensity);
    }
}
