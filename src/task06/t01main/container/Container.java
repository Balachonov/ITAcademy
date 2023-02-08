package task06.t01main.container;

import java.util.Random;

public abstract class Container {

    protected int waterDensity = waterDensity();
    private final int WATER_DENSITY_ONE = 1000;
    private final int WATER_DENSITY_TWO = 2000;
    protected Random random = new Random();

    protected abstract double square(int diagonal);

    protected abstract int waterMass(double volume);

    protected double volume(double square){
        return doHeight() * square;
    }
    protected int waterDensity(){
        return (random.nextInt(2) == 0) ? WATER_DENSITY_ONE : WATER_DENSITY_TWO;
    }

    protected int doHeight(){
        return random.nextInt(10, 100);
    }

}
