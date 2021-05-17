package sample;

import javafx.event.ActionEvent;

import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AuthController_SIM {
    public Button bLogin;
    public TextField tfU;
    public TextField tfG;

    public boolean isValid() {
        return !(tfU.getText().equals("")) && !(tfU.getText().equals(""));
    }

    public void registriraj() {
        // TODO: implement
    }

    public int vrniIdentiteto() {
        return 3;
    }

    public void login(ActionEvent actionEvent) throws IOException {
        if(isValid()){
            Main.setRoot("hub");
        }
    }
}

