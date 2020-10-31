public class BasicCard extends Card {
    private boolean flipped;
    public BasicCard(String title) {
        super(Type.HAZARD, title);
        this.flipped = false;
    }

    public boolean isFlipped() {
        return flipped;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }
}
