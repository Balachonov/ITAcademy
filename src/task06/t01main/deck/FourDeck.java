package task06.t01main.deck;

import task06.t01main.container.ConeBigContainer;
import task06.t01main.container.CylinderBigContainer;
import task06.t01main.container.SquareBigContainer;

public class FourDeck extends Deck{

    protected Object[] loadingDeck(int deckLength) {
        Object[] fourDeck = new Object[2];
        Object cont = null;
        for (int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(3);
            switch (randomNumber) {
                case 0:
                    cont = new ConeBigContainer();
                    break;
                case 1:
                    cont = new CylinderBigContainer();
                    break;
                case 2:
                    cont = new SquareBigContainer();
                    break;
                default:
                    System.out.println("Что-то явно пошло не так");
            }
            fourDeck[i] = cont;
        }
        return fourDeck;
    }
}
