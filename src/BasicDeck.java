import java.util.ArrayList;
import java.util.Collections;

public class BasicDeck extends Deck {

    public BasicDeck() {
        for(int i =0; i<5; i++) this.addCard(new BasicCard("tired", 0));
        for(int i =0; i<3; i++) this.addCard(new BasicCard("strong", 1));
        for(int i =0; i<2; i++) this.addCard(new BasicCard("weak", -1));
        shuffleDrawPile();
    }

}
