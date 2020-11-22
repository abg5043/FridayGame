import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;


public class ButtonPane extends HBox {
    //Tracks number of times draw button is pushed
    private int numDraws = 0;
    private boolean doneDrawing = false;


    //constructor
    public ButtonPane(LifePoints lifePoints, BasicDeck basicDeck, HazardDeck hazardDeck, AgeDeck ageDeck, HazardDisplay currentHazard, BasicDeckPane drawnCards, InfoPane statusPane) {
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

        //Set the action for draw
        drawButton.setOnAction(e -> {
            if(numDraws < hazardDeck.getTopDrawnCard().getFreeCards()) {
                //Draw card
                basicDeck.drawCard();
                //Display top drawn card
                Card currentDrawnCard = basicDeck.getTopDrawnCard();
                drawnCards.getChildren().add(new Label(
                        currentDrawnCard.getTitle() +
                        " (" + currentDrawnCard.getAttack() + " attack)"
                ));
                //update num draws
                numDraws++;

                //update the status pane
                statusPane.updateCardsLeft();

            } else if(doneDrawing == false) {
                //update the status pane
                statusPane.updateStatus("Sorry, out of draws!");
                doneDrawing = true; //make it so that you can't draw anymore
            }
        });

    }




}
