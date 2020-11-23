public class LifePoints {
    private int currentLife;

    public LifePoints() {
        this.currentLife = 20;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public void subtractLife(int life) {
        this.currentLife -= life;
    }

}
