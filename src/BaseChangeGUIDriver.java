import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Driver class for BaseChangeGUI
 * @author James Ostrowski
 */

public class BaseChangeGUIDriver extends Application {
    /**
     * Main function that launches GUI
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Start class, loads in fxml file to launch.
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BaseChangeGUI.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
