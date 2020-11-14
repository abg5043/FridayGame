import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

public class ButtonPane extends HBox {
    public ButtonPane(LifePoints lifePoints, BasicDeck basicDeck, HazardDeck hazardDeck, AgeDeck ageDeck) {
        //Overall styling
        this.setPadding(new Insets(15, 12, 15, 12));
        this.setSpacing(10);
        this.setStyle("-fx-background-color: #336699;");

        //Draw button
        Button drawButton = new Button("Draw");
        drawButton.setPrefSize(100, 20);

        //Claim Button
        Button claimButton = new Button("Claim");
        drawButton.setPrefSize(100, 20);

        //Destroy Button
        Button destroyButton = new Button("Destroy");
        drawButton.setPrefSize(100, 20);

        this.getChildren().addAll(drawButton, claimButton, destroyButton);

    }
}
