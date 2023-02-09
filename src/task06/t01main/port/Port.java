package task06.t01main.port;

import task06.t01main.ship.OneDeckShip;
import task06.t01main.ship.TwoDeckShip;

import java.util.Random;

public class Port {
    static Random random = new Random();

    public static int totalMassWater() {
        int totalMassWater = 0;
        for (int i = 0; i < portRunner().length; i++) {
            totalMassWater += portRunner()[i];
        }
        return totalMassWater;
    }

    private static int[] portRunner() {
        int[] port = new int[10];
        for (int i = 0; i < 10; i++) {
            port[i] = oneShipInPort();
        }
        return port;
    }

    private static int oneShipInPort() {
        int waterMassOneShip = 0;
        OneDeckShip temp = new OneDeckShip();
        TwoDeckShip temp1 = new TwoDeckShip();
        for (int i = 0; i < 2; i++) {
            int randomNumber = random.nextInt(2);
            switch (randomNumber) {
                case 0:
                    waterMassOneShip = temp.loadingShip();
                    break;
                case 1:
                    waterMassOneShip = temp1.loadingShip();
                    break;
                default:
                    System.out.println("Что-то явно пошло не так");
            }
        }
        return waterMassOneShip;
    }
}
