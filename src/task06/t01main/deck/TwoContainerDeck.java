package task06.t01main.deck;

import task06.t01main.container.ConeBigContainer;
import task06.t01main.container.CylinderBigContainer;
import task06.t01main.container.SquareBigContainer;

public class TwoContainerDeck extends Deck {
    @Override
    public int loadingDeck() {
        ConeBigContainer temp = new ConeBigContainer();
        CylinderBigContainer temp1 = new CylinderBigContainer();
        SquareBigContainer temp2 = new SquareBigContainer();
        int waterDeckMass = 0;
        for (int i = 0; i < 2; i++) {
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
                    break;
                default:
                    System.out.println("Что-то явно пошло не так");
            }
        }
        return waterDeckMass;
    }
}

