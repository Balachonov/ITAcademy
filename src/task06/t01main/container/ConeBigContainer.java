package task06.t01main.container;

public class ConeBigContainer extends Container {

    public int waterMass = waterMass(super.volume(square(20)));

    @Override
    public double square(int diagonal) {
        return Math.PI * diagonal * diagonal;
    }

    @Override
    public int waterMass(double volume) {
        return (int) Math.round(volume * super.waterDensity * 0.5);
    }
}
