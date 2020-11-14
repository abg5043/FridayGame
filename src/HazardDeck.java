
import java.util.ArrayList;

public class HazardDeck extends Deck {

    HazardDeck() {
        for(int i = 0; i< 2; i++) addCard(new HazardCard("Exploring the Island", 1, 2, 1, "food", HazardAbility.PLUSONELIFE));
        for(int i = 0; i< 2; i++) addCard(new HazardCard("Exploring the Island", 1, 2, 2, "weapon"));
        addCard(new HazardCard("Exploring the Island", 1, 2, 1, "realization", HazardAbility.DESTROY));

        for(int i = 0; i< 2; i++) addCard(new HazardCard("With the raft to the wreck", 1, 2, 0, "food", HazardAbility.PLUSONELIFE));
        for(int i = 0; i< 2; i++) addCard(new HazardCard("With the raft to the wreck", 1, 2, 0, "equipment", HazardAbility.PLUSTWOCARDS));
        addCard(new HazardCard("With the raft to the wreck", 1, 2, 0, "realization", HazardAbility.DESTROY));

        addCard(new HazardCard("Further exploring the Island", 2, 3, 2, "food", HazardAbility.PLUSONECARD));
        addCard(new HazardCard("Further exploring the Island", 2, 3, 2, "realization", HazardAbility.DESTROY));
        addCard(new HazardCard("Further exploring the Island", 2, 3, 2, "experience", HazardAbility.PLUSONECARD));

        for(int i = 0; i<2; i++) addCard(new HazardCard("Cannibals", 5, 5, 4, "weapon"));

        addCard(new HazardCard("Wild animals", 4, 4, 3, "experience", HazardAbility.PLUSONECARD));
        addCard(new HazardCard("Wild animals", 4, 4, 3, "realization", HazardAbility.DESTROY));

        shuffleDrawPile();
    }
/**
 * The following method was my attempt to override getDrawCard so that it can return a HazardCard object instead of a Card object
    @Override
    public HazardCard getDrawCard() {
        Card drawnCard = getDrawCard();
        HazardCard castedCard = (HazardCard)drawnCard;
        return castedCard;
    }
    */
}
