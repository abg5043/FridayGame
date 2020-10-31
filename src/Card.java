abstract class Card {
    private String title;
    private Type type;

    public Card(Type type, String Title) {
        this.type = type;
        this.title = Title;
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
}

