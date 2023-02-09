package task06.t01main.port;

import task06.t01main.ship.OneDeckShip;
import task06.t01main.ship.TwoDeckShip;

import java.util.Random;

public class Port {
    Random random = new Random();
    public int portRunner(){
        int totalWaterMass = 0;
        for (int i = 0; i < 10; i++) {
            totalWaterMass += oneShipInPort();
        }
        return totalWaterMass;
    }

    public int oneShipInPort(){
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
