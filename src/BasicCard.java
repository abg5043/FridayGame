public class BasicCard extends Card {
    private int attack;

    public BasicCard(String title, int attack) {
        super(Type.BASIC, title);
        this.attack = attack;
    }

}
