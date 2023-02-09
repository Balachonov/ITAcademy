package task06.t01main.container;

public class SquareSmallContainer extends Container {

    public int waterMass = waterMass(super.volume(square(10)));

    @Override
    public double square(int diagonal) {
        return diagonal * diagonal * 0.5;
    }

    @Override
    public int waterMass(double volume) {
        return (int) Math.round(volume * super.waterDensity);
    }
}
