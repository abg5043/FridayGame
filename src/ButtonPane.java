import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;


public class ButtonPane extends HBox {
    //Tracks number of times draw button is pushed
    private int numDraws = 0;
    private final Button claimButton;
    private final Button destroyButton;
    private final Button drawButton;
    InfoPane statusPane;


    //constructor
    public ButtonPane(LifePoints lifePoints, BasicDeck basicDeck, HazardDeck hazardDeck, HazardDisplay currentHazard, BasicDeckPane drawnCards, InfoPane statusPane) {
        //Overall styling
        this.setPadding(new Insets(15, 12, 15, 12));
        this.setSpacing(10);
        this.setStyle("-fx-background-color: #336699;");
        this.statusPane = statusPane;

        //Draw button
        drawButton = new Button("Draw");
        drawButton.setPrefSize(100, 20);


        //Claim Button
        claimButton = new Button("Claim");
        drawButton.setPrefSize(100, 20);
        claimButton.setDisable(true);


        //Destroy Button
        destroyButton = new Button("Destroy");
        drawButton.setPrefSize(100, 20);

        this.getChildren().addAll(drawButton, claimButton, destroyButton);

        //Set the action for draw
        drawButton.setOnAction(e -> {

            //Draw card
            basicDeck.drawCard();
            //Display top drawn card
            Card currentDrawnCard = basicDeck.getTopDrawnCard();

            drawnCards.addDisplayedCard(currentDrawnCard.getTitle() +
                    " (" + currentDrawnCard.getAttack() + " attack)");

            //update num draws
            numDraws++;

            //update the status pane
            statusPane.updateDrawPileCardsLeft();
            statusPane.updateCurrentAttack();

            //update claim button if the attack can overcome hazard

            if(basicDeck.getDrawnCardsAttack() >= hazardDeck.getTopDrawnCard().getDefense()) claimButton.setDisable(false);

            //make it so that you can't draw anymore if you have no more draws
            if(numDraws >= hazardDeck.getTopDrawnCard().getFreeCards()) {
                statusPane.updateStatus("Sorry, out of draws!");
                drawButton.setDisable(true);
            }

            //Check if there are no cards to draw
            if(basicDeck.getNumDrawPileCards() <= 0) {
                if(basicDeck.getNumDiscardCards() <= 0) { //If no cards anywhere, you lose
                    loseGame();
                } else {
                    basicDeck.restockDrawPile(); //If you have cards in discard pile, you can reshuffle them in
                    statusPane.updateDrawPileCardsLeft();
                    statusPane.updateNumDiscardCards();
                }
            }
        });

        claimButton.setOnAction(e -> {

            HazardCard claimedHazard = hazardDeck.getTopDrawnCard();
            claimedHazard.setFlipped(true); //flip current hazard card
            basicDeck.addCardToDiscardPile(claimedHazard); //add it to the basicDeck discard pile
            basicDeck.discardDrawnCards(); //discard drawn cards

            //remove labels of drawn cards
            drawnCards.removeDisplayedCards();

            //disable the claim button since you just used it!
            claimButton.setDisable(true);

            //update hazard card display
            currentHazard.updateHazardDisplay();

            //update status pane
            statusPane.updateNumDiscardCards();

            //reset number of draws to 0
            numDraws = 0;

            //reset status pane and draw button
            statusPane.updateStatus("");
            drawButton.setDisable(false);

            //Check if you WON (aka there are no more hazards left)
            if(hazardDeck.getDrawPile().size() == 0) {
                winGame();
            }


        });


        destroyButton.setOnAction(e -> {
            //subtract life points equal to defense - attack
            int lostLife = hazardDeck.getTopDrawnCard().getDefense() - basicDeck.getDrawnCardsAttack();
            if(lostLife >= 0) {
                lifePoints.subtractLife(lostLife);
            }

            //update the status pane to reflect the above
            statusPane.updateLife();
            System.out.println(lifePoints.getCurrentLife());

            //destroy drawn cards
            basicDeck.destroyDrawnCards();

            //destroy current hazard
            hazardDeck.destroyDrawnCards();



            //update drawn card display
            drawnCards.removeDisplayedCards();

            //update hazard card display
            currentHazard.updateHazardDisplay();

            //reset number of draws to 0
            numDraws = 0;

            //reset status pane and draw button
            statusPane.updateStatus("");
            drawButton.setDisable(false);


            //Check if you WON (aka there are no more hazards left)
            if(hazardDeck.getDrawPile().size() == 0) {
                winGame();
            }

            //check if you lost based on life...if so, disable everything
            if(lifePoints.getCurrentLife() < 0) {
                loseGame();
            }

            //check if you lost based on no more cards...if so, disable everything
            if(basicDeck.getNumDrawPileCards() <= 0) {
                if(basicDeck.getNumDiscardCards() <= 0) { //If no cards anywhere, you lose
                    loseGame();
                } else {
                    basicDeck.restockDrawPile(); //If you have cards in discard pile, you can reshuffle them in
                    statusPane.updateDrawPileCardsLeft();
                    statusPane.updateNumDiscardCards();
                }
            }


        });



    }


    public void loseGame() {
        statusPane.updateStatus("Sorry, you lost!");
        claimButton.setDisable(true);
        drawButton.setDisable(true);
        destroyButton.setDisable(true);
    }

    public void winGame() {
        statusPane.updateStatus("Yay! You won!");
        claimButton.setDisable(true);
        drawButton.setDisable(true);
        destroyButton.setDisable(true);
    }


}
