public class LifePoints {
    private int currentLife;

    public LifePoints() {
        this.currentLife = 20;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public void subtractLife() {
        if(currentLife > 0) currentLife--;
        else currentLife = 0;
    }

    public void addLife() {
        currentLife++;
    }
}
