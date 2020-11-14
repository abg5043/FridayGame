import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class HazardDisplay extends VBox {
    public HazardDisplay(HazardDeck hazardDeck) {
        Label caption = new Label("Current Hazard");
        Font fontBold = Font.font("Veranda", FontWeight.BOLD, FontPosture.REGULAR, 20);
        caption.setFont(fontBold);
        Label title = new Label(hazardDeck.getDrawCard().getTitle());

        //Need to fix these two labrels so that they return integers.
        //Label defense = new Label(Integer.toString(hazardDeck.getDrawCard().getDefense()));
        //Label freeCards = new Label(Integer.toString(hazardDeck.getDrawCard().getFreeCards()));

        getChildren().addAll(caption, title);
    }
}
