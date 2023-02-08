package task06.t01main.container;

public class CylinderSmallContainer extends Container{

    public int waterMassSquareBigContainer = waterMass(super.volume(square(10)));

    @Override
    protected double square(int diagonal) {
        return Math.PI * 20 * 20;
    }

    @Override
    protected int waterMass(double volume) {
        return (int) Math.round(volume * super.waterDensity);
    }
}
