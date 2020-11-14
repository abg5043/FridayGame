import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

public class InfoPane extends HBox {
    public InfoPane(LifePoints lifePoints, BasicDeck basicDeck, HazardDeck hazardDeck, AgeDeck ageDeck) {
        //Overall styling
        this.setPadding(new Insets(15, 12, 15, 12));
        this.setSpacing(10);
        this.setStyle("-fx-background-color: #336699;");

        //Life label
        Label life = new Label(Integer.toString(lifePoints.getCurrentLife()) + " Life Left");
        life.setTextFill(Color.WHITE);

        //Padding region
        Region region1 = new Region();
        HBox.setHgrow(region1, Priority.ALWAYS);

        //New Basic Deck
        Label basicCardsLeft = new Label(Integer.toString(basicDeck.getNumDrawCards()) + " Cards Left");
        basicCardsLeft.setTextFill(Color.WHITE);

        this.getChildren().addAll(life, region1, basicCardsLeft);

    }
}
