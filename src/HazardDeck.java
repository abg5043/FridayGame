public class HazardDeck extends Deck {

    HazardDeck() {
        for(int i = 0; i< 2; i++) addCardToDrawPile(new HazardCard("Exploring the Island", 1, 2, 1, "food", HazardAbility.PLUSONELIFE));
        for(int i = 0; i< 2; i++) addCardToDrawPile(new HazardCard("Exploring the Island", 1, 2, 2, "weapon"));
        addCardToDrawPile(new HazardCard("Exploring the Island", 1, 2, 1, "realization", HazardAbility.DESTROY));

        for(int i = 0; i< 2; i++) addCardToDrawPile(new HazardCard("With the raft to the wreck", 1, 2, 0, "food", HazardAbility.PLUSONELIFE));
        for(int i = 0; i< 2; i++) addCardToDrawPile(new HazardCard("With the raft to the wreck", 1, 2, 0, "equipment", HazardAbility.PLUSTWOCARDS));
        addCardToDrawPile(new HazardCard("With the raft to the wreck", 1, 2, 0, "realization", HazardAbility.DESTROY));

        addCardToDrawPile(new HazardCard("Further exploring the Island", 2, 3, 2, "food", HazardAbility.PLUSONECARD));
        addCardToDrawPile(new HazardCard("Further exploring the Island", 2, 3, 2, "realization", HazardAbility.DESTROY));
        addCardToDrawPile(new HazardCard("Further exploring the Island", 2, 3, 2, "experience", HazardAbility.PLUSONECARD));

        for(int i = 0; i<2; i++) addCardToDrawPile(new HazardCard("Cannibals", 5, 5, 4, "weapon"));

        addCardToDrawPile(new HazardCard("Wild animals", 4, 4, 3, "experience", HazardAbility.PLUSONECARD));
        addCardToDrawPile(new HazardCard("Wild animals", 4, 4, 3, "realization", HazardAbility.DESTROY));

        shuffleDrawPile();
    }

    @Override
    public HazardCard getTopDrawnCard() {
        Card drawnCard = super.getTopDrawnCard();
        return (HazardCard)drawnCard;
    }

}
