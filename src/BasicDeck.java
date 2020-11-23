public class BasicDeck extends Deck {

    public BasicDeck() {
        addCardToDrawPile(new BasicCard("genius", 2));
        for(int i =0; i<3; i++) addCardToDrawPile(new BasicCard("focused", 1));
        for(int i =0; i<8; i++) addCardToDrawPile(new BasicCard("weak", 0));
        for(int i =0; i<5; i++) addCardToDrawPile(new BasicCard("distracted", -1));
        shuffleDrawPile();
    }

}
