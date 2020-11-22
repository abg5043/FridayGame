import java.util.ArrayList;
import java.util.Collections;

public class BasicDeck extends Deck {

    public BasicDeck() {
        addCard(new BasicCard("genius", 2));
        for(int i =0; i<3; i++) addCard(new BasicCard("focused", 1));
        for(int i =0; i<8; i++) addCard(new BasicCard("weak", 0));
        for(int i =0; i<5; i++) addCard(new BasicCard("distracted", -1));
        shuffleDrawPile();
    }

}
