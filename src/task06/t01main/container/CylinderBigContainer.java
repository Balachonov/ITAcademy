package task06.t01main.container;

public class CylinderBigContainer extends Container{

    public int waterMass = waterMass(super.volume(square(20)));

    @Override
    protected double square(int diagonal) {
        return Math.PI * diagonal * diagonal;
    }

    @Override
    protected int waterMass(double volume) {
        return (int) Math.round(volume * super.waterDensity);
    }

}
