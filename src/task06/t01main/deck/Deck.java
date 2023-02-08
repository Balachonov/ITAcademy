package task06.t01main.deck;

import java.util.Random;

public abstract class Deck {
    protected int deckLength = randomLenght();
    protected Random random = new Random();
    protected int randomLenght(){
        return (random.nextInt(2) == 0) ? 2 : 4;
    }

    protected abstract Object[] loadingDeck(int deckLength);
}
