package RIS;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class EndController {
    public RadioButton spletButton1;
    public ToggleGroup nacinButtons1;
    public RadioButton gotovinaButton1;
    public RadioButton karticaButton1;
    public Label kredTxt;
    public TextField karticaTxt;
    public TextField ccvTxt;
    public Label ccvLeb;

    public void nacinBtns(ActionEvent actionEvent) {
        if(spletButton1.isSelected())
        {
            ccvLeb.setVisible(true);
            kredTxt.setVisible(true);
            karticaTxt.setVisible(true);
            ccvTxt.setVisible(true);
        }
        else
        {
            ccvLeb.setVisible(false);
            kredTxt.setVisible(false);
            karticaTxt.setVisible(false);
            ccvTxt.setVisible(false);
        }
    }

    public void placajCB(ActionEvent actionEvent) throws IOException {
        Main.setRoot("konec");
    }

    public void nazajCB(ActionEvent actionEvent) throws IOException {
        Main.setRoot("hub");
    }
}
