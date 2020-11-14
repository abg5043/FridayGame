import javax.management.remote.SubjectDelegationPermission;

public class HazardCard extends Card {


    private boolean flipped;
    private HazardAbility ability;
    private int freeCards;
    private int defense;
    private String flippedTitle;

    public HazardCard(String title, int defense, int freeCards, int attack, String flippedTitle) {
        super(Type.HAZARD, title, attack);
        this.flipped = false;
        this.ability = null;
        this.defense = defense;
        this.flippedTitle = flippedTitle;
        this.freeCards = freeCards;
    }

    public HazardCard(String title, int defense, int freeCards, int attack, String flippedTitle, HazardAbility ability) {
        super(Type.HAZARD, title, attack);
        this.flipped = false;
        this.ability = ability;
        this.defense = defense;
        this.flippedTitle = flippedTitle;
    }

    public HazardAbility getAbility() {
        return ability;
    }

    public int getDefense() {
        return defense;
    }

    public int getFreeCards() {
        return freeCards;
    }

    public String getFlippedTitle() {
        return flippedTitle;
    }

    public boolean isFlipped() {
        return flipped;
    }
}
