package task06.t01main.ship;

import task06.t01main.container.ConeBigContainer;
import task06.t01main.container.CylinderBigContainer;
import task06.t01main.container.SquareBigContainer;
import task06.t01main.deck.FourContainerDeck;
import task06.t01main.deck.TwoContainerDeck;

public class OneDeckShip extends Ship {

    @Override
    public int loadingShip() {
        TwoContainerDeck temp = new TwoContainerDeck();
        FourContainerDeck temp1 = new FourContainerDeck();
        int waterShipMass = 0;
        for (int i = 0; i < 2; i++) {
            int randomNumber = random.nextInt(2);
            switch (randomNumber) {
                case 0:
                    waterShipMass = temp.loadingDeck();
                    break;
                case 1:
                    waterShipMass = temp1.loadingDeck();
                    break;
                default:
                    System.out.println("Что-то явно пошло не так");
            }
        }
        return waterShipMass;
    }
}

