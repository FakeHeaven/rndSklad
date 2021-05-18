package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class regController {
    public Button registracijaB;
    public TextField username;

    public void regCB(ActionEvent actionEvent) throws IOException {
        users.users1[0] = username.getText();
        Main.setRoot("auth");
    }
}
