import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck(Card ... cards) {
        addCards(cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void addCards(Card ... cards) {
        for (Card card : cards) {
            addCard(card);
        }
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
