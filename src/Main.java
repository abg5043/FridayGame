import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

        BorderPane mainPane = new BorderPane();
        mainPane.setTop(new InfoPane(life, basicDeck));


        primaryStage.setTitle("Friday Fails: Round 1");
        primaryStage.setScene(new Scene(mainPane, 300, 250));
        primaryStage.show();

    }
}