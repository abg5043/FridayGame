import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class HazardDisplay extends VBox {
    public HazardDisplay(HazardDeck hazardDeck) {
        this.setSpacing(15);

        //Create Title
        HBox title = new HBox();
        Label caption = new Label("Current Hazard");
        Font fontBold = Font.font("Veranda", FontWeight.BOLD, FontPosture.REGULAR, 30);
        caption.setFont(fontBold);
        title.getChildren().add(caption);
        title.setAlignment(Pos.BASELINE_CENTER);


        //Create labels for rest of parameters
        Font fontItalic = Font.font("Veranda", FontWeight.NORMAL, FontPosture.ITALIC, 18);
        hazardDeck.drawCard();  //Draw a card
        Label cardTitle = new Label(hazardDeck.getTopDrawnCard().getTitle());
        cardTitle.setFont(fontItalic);
        Label defense = new Label("Current defense: " + Integer.toString((hazardDeck.getTopDrawnCard()).getDefense()));
        Label freeCards = new Label("Free draws: " + Integer.toString(hazardDeck.getTopDrawnCard().getFreeCards()));

        //Add everything to the pane
        getChildren().addAll(title, cardTitle, defense, freeCards);
    }
}
