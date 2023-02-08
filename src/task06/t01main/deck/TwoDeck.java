package task06.t01main.deck;

import task06.t01main.container.ConeBigContainer;
import task06.t01main.container.CylinderBigContainer;
import task06.t01main.container.SquareBigContainer;

public class TwoDeck extends Deck {
    @Override
    protected Object[] loadingDeck(int deckLength) {
        Object[] twoDeck = new Object[2];
        Object cont = null;
        for (int i = 0; i < 2; i++) {
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
            twoDeck[i] = cont;
        }
        return twoDeck;
    }
}

