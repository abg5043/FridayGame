import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class BasicDeckPane extends VBox {
    VBox drawnCards;

    public BasicDeckPane(LifePoints lifePoints, BasicDeck basicDeck, HazardDeck hazardDeck, AgeDeck ageDeck) {
        this.setSpacing(15);
        this.setPadding(new Insets(12, 12, 12, 12));

        //Create Title
        HBox title = new HBox();
        Label caption = new Label("Drawn Cards");
        Font fontBold = Font.font("Veranda", FontWeight.BOLD, FontPosture.REGULAR, 30);
        caption.setFont(fontBold);
        title.getChildren().add(caption);
        title.setAlignment(Pos.BASELINE_CENTER);

        //Create Blank Vbox for drawn cards
        drawnCards = new VBox();


        //Add everything to the pane
        getChildren().addAll(title, drawnCards);
    }

}
