public class HazardCard extends Card {


    private boolean flipped;
    private final HazardAbility ability;
    private final int freeCards;
    private final int defense;
    private final String flippedTitle;

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
        this.freeCards = freeCards;
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

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    @Override
    public String getTitle() {
        if(this.isFlipped()) {
            return getFlippedTitle();
        } else {
            return super.getTitle();
        }
    }
}


