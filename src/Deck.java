import java.util.ArrayList;
import java.util.Collections;

abstract class Deck {
    private final ArrayList<Card> drawPile = new ArrayList<>();
    private final ArrayList<Card> discardPile = new ArrayList<>();
    private final ArrayList<Card> destroyedPile = new ArrayList<>();
    private final ArrayList<Card> drawnCards = new ArrayList<>();
    private int drawnCardsAttack = 0;

    public Deck(Card ... cards) {
        addCardsToDrawPiles(cards);
    }

    public ArrayList<Card> getDrawPile() {
        return drawPile;
    }

    public int getNumDrawPileCards() {
        return drawPile.size();
    }

    public int getNumDiscardCards() {
        return discardPile.size();
    }

    public Card getTopDrawPileCard() {
        return drawPile.get(0);
    }

    public Card getTopDrawnCard() {
        return drawnCards.get(drawnCards.size()-1);
    }

    //Returns the sum of the drawn card attack
    public int getDrawnCardsAttack() {
        return drawnCardsAttack;
    }

    public void addCardToDrawPile(Card card) {
        this.drawPile.add(card);
    }

    public void addCardsToDrawPiles(Card ... cards) {
        for (Card card : cards) {
            addCardToDrawPile(card);
        }
    }

    public void addCardToDiscardPile(Card card) { this.discardPile.add(card);}

    public void shuffleDrawPile() {
        Collections.shuffle(drawPile);
    }

    //Make discard pile into the draw pile
    public void restockDrawPile() {
        while(!discardPile.isEmpty()) {
            drawPile.add(discardPile.get(0));
            discardPile.remove(0);
        }
        shuffleDrawPile();
    }

    //Draws card from drawPile and places them in drawn card pile
    public void drawCard() {
        drawnCards.add(getTopDrawPileCard());
        drawnCardsAttack += getTopDrawPileCard().getAttack();
        drawPile.remove(0);
    }

    //Discards draw cards
    public void discardDrawnCards() {
        for(int i = 0; i < drawnCards.size(); i++) {
            discardPile.add(drawnCards.get(0));
            drawnCards.remove(drawnCards.get(0));
        }
        this.drawnCardsAttack = 0;
    }

    //Destroys drawn cards
    public void destroyDrawnCards() {
        for(int i = 0; i < drawnCards.size(); i++) {
            destroyedPile.add(drawnCards.get(0));
            drawnCards.remove(drawnCards.get(0));
        }
        this.drawnCardsAttack = 0;
    }

}
