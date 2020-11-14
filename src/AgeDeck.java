public class AgeDeck extends Deck {
    public AgeDeck() {
        addCard(new AgeCard("very tired", 0));
        for(int i = 0; i<2; i++) addCard(new AgeCard("distracted", -1));
        for(int i = 0; i<2; i++) addCard(new AgeCard("stupid", -2));
        for(int i = 0; i<2; i++) addCard(new AgeCard("stupid", 0));
        shuffleDrawPile();
    }
}
