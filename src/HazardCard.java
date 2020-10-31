public class HazardCard extends Card {
    private boolean flipped;
    public HazardCard(String title) {
        super(Type.HAZARD, title);
        this.flipped = false;
    }
}
