public class LifePoints {
    private int currentLife;
    private int discardedLife;

    public LifePoints() {
        this.currentLife = 20;
        this.discardedLife = 2;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public int getDiscardedLife() {
        return discardedLife;
    }
}
