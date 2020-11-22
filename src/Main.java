import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }




    @Override
    public void start(Stage primaryStage) {

        // construct root pane of board
        Board board = new Board();

        primaryStage.setTitle("Friday Fails: Round 1");
        primaryStage.setScene(new Scene(board, 900, 500));
        primaryStage.show();

    }


}