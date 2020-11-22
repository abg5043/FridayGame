public class Card {

    enum Type {
        BASIC,
        HAZARD,
        AGE
    }

    private String title;
    private Type type;
    private int attack;

    public Card(Type type, String title, int attack) {
        this.type = type;
        this.title = title;
        this.attack = attack;

    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }
}

