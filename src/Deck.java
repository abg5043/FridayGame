import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

abstract class Deck {
    private ArrayList<Card> drawPile = new ArrayList<>();
    private ArrayList<Card> discardPile = new ArrayList<>();
    private ArrayList<Card> destroyedPile = new ArrayList<>();

    public Deck(Card ... cards) {
        addCards(cards);
    }

    public ArrayList<Card> getDrawPile() {
        return drawPile;
    }

    public ArrayList<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(ArrayList<Card> discardPile) {
        this.discardPile = discardPile;
    }

    public void setDrawPile(ArrayList<Card> drawPile) {
        this.drawPile = drawPile;
    }

    public void addCard(Card card) {
        this.drawPile.add(card);
    }

    public void addCards(Card ... cards) {
        for (Card card : cards) {
            addCard(card);
        }
    }

    public void shuffleDrawPile() {
        Collections.shuffle(drawPile);
    }

    public int getNumDrawCards() {
        return drawPile.size();
    }

    public int getNumDiscardCards() {
        return discardPile.size();
    }

    public void restockDrawPile() {
        while(!discardPile.isEmpty()) {
            drawPile.add(discardPile.get(0));
            discardPile.remove(0);
        }
        shuffleDrawPile();
    }

    public Card getDrawCard() {
        return drawPile.get(0);
    }

}
