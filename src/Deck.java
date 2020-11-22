import java.util.ArrayList;
import java.util.Collections;

abstract class Deck {
    private ArrayList<Card> drawPile = new ArrayList<>();
    private ArrayList<Card> discardPile = new ArrayList<>();
    private ArrayList<Card> destroyedPile = new ArrayList<>();
    private ArrayList<Card> drawnCards = new ArrayList<>();
    private int drawnCardAttack = 0;

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


    //Make discard pile into the draw pile
    public void restockDrawPile() {
        while(!discardPile.isEmpty()) {
            drawPile.add(discardPile.get(0));
            discardPile.remove(0);
        }
        shuffleDrawPile();
    }

    public Card getTopDrawPileCard() {
        return drawPile.get(0);
    }

    public Card getTopDrawnCard() {
        return drawnCards.get(drawnCards.size()-1);
    }

    public ArrayList<Card> getDrawnCards() {
        return drawnCards;
    }

    public ArrayList<Card> getDestroyedPile() {
        return destroyedPile;
    }

    //Returns the sum of the drawn card attack
    public int getDrawnCardAttack() {
        return drawnCardAttack;
    }

    //Draws card from drawPile and places them in drawn card pile
    public Card drawCard() {
        drawnCards.add(getTopDrawPileCard());
        drawnCardAttack += getTopDrawPileCard().getAttack();
        drawPile.remove(0);

        return getTopDrawnCard();
    }

    //Discards draw cards
    public void discardDrawnCards() {
        for(Card card : drawnCards) {
            discardPile.add(card);
            drawnCards.remove(card);
        }
    }

}
