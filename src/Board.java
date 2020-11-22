import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Board extends BorderPane {


    public Board() {


        //initialize life points and basic deck
        LifePoints life = new LifePoints();
        //Fields containing the three decks and life points for the game
        BasicDeck basicDeck = new BasicDeck();
        HazardDeck hazardDeck = new HazardDeck();
        AgeDeck ageDeck = new AgeDeck();

        //construct top status bar
        InfoPane statusBar = new InfoPane(life, basicDeck, hazardDeck, ageDeck);
        this.setTop(statusBar);

        //construct center display of current hazard to fight
        HazardDisplay currentHazard = new HazardDisplay(hazardDeck);
        currentHazard.setAlignment(Pos.CENTER);
        currentHazard.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        this.setCenter(currentHazard);
        currentHazard.setPrefWidth(300);

        //construct left pane that displays drawn cards
        BasicDeckPane drawnCards = new BasicDeckPane(life, basicDeck, hazardDeck, ageDeck);
        this.setLeft(drawnCards);
        drawnCards.setAlignment(Pos.CENTER);
        drawnCards.setPrefWidth(300);


        //construct buttons on bottom
        ButtonPane actions = new ButtonPane(life, basicDeck, hazardDeck, ageDeck, currentHazard, drawnCards, statusBar);
        actions.setAlignment(Pos.CENTER);
        this.setBottom(actions);

        //Construct blank right pane to make it look nice
        FlowPane blankPane = new FlowPane();
        this.setRight(blankPane);
        blankPane.setPrefWidth(300);





    }

    @Override
    public boolean isResizable() {
        return false;
    }
}
