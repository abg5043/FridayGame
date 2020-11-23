public class Card {

    enum Type {
        BASIC,
        HAZARD,
        AGE
    }

    private final String title;
    private final Type type;
    private final int attack;

    public Card(Type type, String title, int attack) {
        this.type = type;
        this.title = title;
        this.attack = attack;

    }

    public String getTitle() {
        return title;
    }

    public int getAttack() {
        return attack;
    }
}

