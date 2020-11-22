import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

public class InfoPane extends HBox {
    //Label showing num life left
    Label life;

    //Lifepoints left in game
    LifePoints lifePoints;

    //Label showing basic cards left in deck
    Label basicCardsLeft;

    //Curent basic deck
    BasicDeck basicDeck;

    //Status message
    Label status;


    public InfoPane(LifePoints lifePoints, BasicDeck basicDeck, HazardDeck hazardDeck, AgeDeck ageDeck) {
        this.lifePoints = lifePoints;
        this.basicDeck = basicDeck;

        //Overall styling
        this.setPadding(new Insets(15, 12, 15, 12));
        this.setSpacing(10);
        this.setStyle("-fx-background-color: #336699;");

        //Life label
        life = new Label(Integer.toString(lifePoints.getCurrentLife()) + " Life Left");
        life.setTextFill(Color.WHITE);

        //Padding region
        Region region1 = new Region();
        HBox.setHgrow(region1, Priority.ALWAYS);

        //Status message
        status = new Label("");
        status.setTextFill(Color.WHITE);

        //Padding region 2
        Region region2 = new Region();
        HBox.setHgrow(region2, Priority.ALWAYS);

        //New Basic Deck label
        basicCardsLeft = new Label(Integer.toString(basicDeck.getNumDrawCards()) + " Cards Left");
        basicCardsLeft.setTextFill(Color.WHITE);

        this.getChildren().addAll(life, region1, status, region2, basicCardsLeft);

    }

    public void updateLife() {
        life.setText(Integer.toString(lifePoints.getCurrentLife()));
    }

    public void updateCardsLeft() {basicCardsLeft.setText(Integer.toString(basicDeck.getNumDrawCards()) + " Cards Left");}

    public void updateStatus(String message) {
        this.status.setText(message);
    }
}

