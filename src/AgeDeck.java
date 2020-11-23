public class AgeDeck extends Deck {
    public AgeDeck() {
        addCardToDrawPile(new AgeCard("very tired", 0));
        for(int i = 0; i<2; i++) addCardToDrawPile(new AgeCard("distracted", -1));
        for(int i = 0; i<2; i++) addCardToDrawPile(new AgeCard("stupid", -2));
        for(int i = 0; i<2; i++) addCardToDrawPile(new AgeCard("stupid", 0));
        shuffleDrawPile();
    }
}
