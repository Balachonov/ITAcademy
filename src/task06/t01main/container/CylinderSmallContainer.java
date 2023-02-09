package task06.t01main.container;

public class CylinderSmallContainer extends Container{

    public int waterMass = waterMass(super.volume(square(10)));

    @Override
    public double square(int diagonal) {
        return Math.PI * diagonal * diagonal;
    }

    @Override
    public int waterMass(double volume) {
        return (int) Math.round(volume * super.waterDensity);
    }
}
