import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTests {

    @Test
    public void createDeck() {
        var deck = new Deck();
        Card test = new BasicCard("cheese");
        deck.addCard(test);
        assertEquals(deck.getCards().size(), 1);
    }
}