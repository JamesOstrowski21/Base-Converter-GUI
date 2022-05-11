import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Controller Class for GUI
 * @author James Ostrowski
 */

public class BaseChangeGUIController {

    /**
     * Original text field
     */
    @FXML
    private TextField originalNumberField;

    /**
     * new number text field
     */
    @FXML
    private TextField newNumberField;

    /**
     * original base combo box
     */
    @FXML
    private ComboBox<?> originalBaseBox;

    /**
     * new base combo box
     */
    @FXML
    private ComboBox<?> newBaseBox;

    /**
     * Swap button 
     */
    @FXML
    private Button swapButton;

    /**
     * Method to swap the new base combobox
     */
    public void swapBase(ActionEvent event){
        List<String> givenList = Arrays.asList("2","8","10","12","16"); //List of values in comboBox
        Random rand = new Random(); //Initialize rand
        int randomElement = rand.nextInt(givenList.size()); //get a random index for comboBox
        newBaseBox.getSelectionModel().select(randomElement); //Set comboBox to random element
        int original = Integer.parseInt((String) originalBaseBox.getValue()); //Next 5 lines recalculate conversion and display converted number
        int newbase= Integer.parseInt((String) newBaseBox.getValue());
        String OriginalNum = originalNumberField.getText();
        BaseConversionGUI convert = new BaseConversionGUI(OriginalNum, original,newbase);
        newNumberField.setText(convert.getNewNum());

    }

    /**
     * Method to automatically convert the number as the user types in the textField
     */
    public void changeBase (KeyEvent event){
        int original = Integer.parseInt((String) originalBaseBox.getValue());
        int newbase= Integer.parseInt((String) newBaseBox.getValue());
        String OriginalNum = originalNumberField.getText();
        BaseConversionGUI convert = new BaseConversionGUI(OriginalNum, original,newbase);
        newNumberField.setText(convert.getNewNum());
    }


}
