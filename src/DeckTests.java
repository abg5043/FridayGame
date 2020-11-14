import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTests {

    @Test
    public void createBasicDeck() {
        var basicDeck = new BasicDeck();
        assertEquals(basicDeck.getDrawPile().size(), 16);
    }

}