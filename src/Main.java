import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Scanner;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //initialize life points and basic deck
        LifePoints life = new LifePoints();
        BasicDeck basicDeck = new BasicDeck();
        HazardDeck hazardDeck = new HazardDeck();
        AgeDeck ageDeck = new AgeDeck();

        BorderPane board = new BorderPane();


        InfoPane statusBar = new InfoPane(life, basicDeck, hazardDeck, ageDeck);
        ButtonPane actions = new ButtonPane(life, basicDeck, hazardDeck, ageDeck);
        actions.setAlignment(Pos.CENTER);
        HazardDisplay currentHazard = new HazardDisplay(hazardDeck);
        currentHazard.setAlignment(Pos.CENTER);
        board.setTop(statusBar);
        board.setBottom(actions);
        board.setCenter(currentHazard);


        primaryStage.setTitle("Friday Fails: Round 1");
        primaryStage.setScene(new Scene(board, 300, 250));
        primaryStage.show();

    }


}