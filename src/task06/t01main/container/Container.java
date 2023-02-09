package task06.t01main.container;

import java.util.Random;

public abstract class Container {

    private final int WATER_DENSITY_ONE = 1000;
    private final int WATER_DENSITY_TWO = 2000;
    private Random random = new Random();

    protected int waterDensity = (random.nextInt(2) == 0) ? WATER_DENSITY_ONE : WATER_DENSITY_TWO;

    protected abstract double square(int diagonal);

    protected abstract int waterMass(double volume);

    protected double volume(double square) {
        return doHeight() * square;
    }

    private int doHeight() {
        return random.nextInt(10, 100);
    }

}
