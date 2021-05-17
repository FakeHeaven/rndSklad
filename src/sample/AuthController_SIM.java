package sample;

import javafx.event.ActionEvent;

import java.io.IOException;
import javafx.scene.control.Button;

public class AuthController_SIM {
    public Button bLogin;

    public boolean isValid() {
        return true;
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

