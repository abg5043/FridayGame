import javafx.geometry.Insets;
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
    Label drawPileCardsLeft;

    //Curent basic deck
    BasicDeck basicDeck;

    //Status message
    Label status;

    //Current attack message
    Label currentAttack;

    //Number discard cards
    Label numDiscardCards;


    public InfoPane(LifePoints lifePoints, BasicDeck basicDeck) {
        this.lifePoints = lifePoints;
        this.basicDeck = basicDeck;

        //Overall styling
        this.setPadding(new Insets(15, 12, 15, 12));
        this.setSpacing(10);
        this.setStyle("-fx-background-color: #336699;");

        //Life label
        life = new Label(lifePoints.getCurrentLife() + " Life Left");
        life.setTextFill(Color.WHITE);

        //Barrier Label
        Label barrier = new Label(" || ");
        barrier.setTextFill(Color.WHITE);

        //Second barrier Label
        Label barrier2 = new Label(" || ");
        barrier2.setTextFill(Color.WHITE);

        //Cards left label
        drawPileCardsLeft = new Label(basicDeck.getNumDrawPileCards() + " Cards in Draw Pile");
        drawPileCardsLeft.setTextFill(Color.WHITE);

        //Padding region
        Region region1 = new Region();
        HBox.setHgrow(region1, Priority.ALWAYS);

        //Status message
        status = new Label("");
        status.setTextFill(Color.WHITE);

        //Padding region 2
        Region region2 = new Region();
        HBox.setHgrow(region2, Priority.ALWAYS);

        //Number discard cards left message
        numDiscardCards = new Label(basicDeck.getNumDiscardCards() + " Cards in Discard Pile");
        numDiscardCards.setTextFill(Color.WHITE);

        //Current attack message
        currentAttack = new Label("Current Attack: " + basicDeck.getDrawnCardsAttack());
        currentAttack.setTextFill(Color.WHITE);





        this.getChildren().addAll(life, barrier, currentAttack, region1, status, region2, numDiscardCards, barrier2, drawPileCardsLeft);

    }

    public void updateLife() {

        life.setText(lifePoints.getCurrentLife() + " Life Left");
    }

    public void updateDrawPileCardsLeft() {
        drawPileCardsLeft.setText(basicDeck.getNumDrawPileCards() + " Cards in Draw Pile");}

    public void updateStatus(String message) {
        this.status.setText(message);
    }

    public void updateNumDiscardCards() {
        numDiscardCards.setText(basicDeck.getNumDiscardCards() + " Cards in Discard Pile");
    }

    public void updateCurrentAttack() {
        currentAttack.setText("Current Attack: " + basicDeck.getDrawnCardsAttack());
    }
}

