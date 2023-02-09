package task06.t01main.deck;

import task06.t01main.container.*;

public class FourContainerDeck extends Deck {

    public int loadingDeck() {
        ConeSmallContainer temp = new ConeSmallContainer();
        CylinderSmallContainer temp1 = new CylinderSmallContainer();
        SquareSmallContainer temp2 = new SquareSmallContainer();
        int waterDeckMass = 0;
        for (int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(3);
            switch (randomNumber) {
                case 0:
                    waterDeckMass += temp.waterMass;
                    break;
                case 1:
                    waterDeckMass += temp2.waterMass;
                    break;
                case 2:
                    waterDeckMass += temp1.waterMass;
                    ;
                    break;
                default:
                    System.out.println("Что-то явно пошло не так");
            }
        }
        return waterDeckMass;
    }
}

