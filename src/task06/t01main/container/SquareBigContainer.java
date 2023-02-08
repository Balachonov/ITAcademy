package task06.t01main.container;

public class SquareBigContainer extends Container{

    public int waterMassSquareBigContainer = waterMass(super.volume(square(20)));

    @Override
    protected double square(int diagonal) {
        return diagonal * diagonal * 0.5;
    }

    @Override
    protected int waterMass(double volume) {
        return (int) Math.round(volume * super.waterDensity);
    }
}
