package sample;

import javafx.event.ActionEvent;

import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AuthController_SIM {
    public Button bLogin;
    public TextField tfU;
    public TextField tfG;
    public Label status;

    public boolean isValid() {

        String[] usersa  = users.getUsers();
        for(String user : usersa)
        {
            if(tfU.getText().equals(user) && !(tfG.getText().equals("")))
            {
                return true;
            }
            else
            {
                status.setText("Napačni podatki/uporabnik ne obstaja.");
            }
        }
        return false;
    }

    public void registriraj() throws IOException {
        Main.setRoot("reg");
    }

    public int vrniIdentiteto() {
        return 3;
    }

    public void login(ActionEvent actionEvent) throws IOException {
        if(isValid()){
            Main.setRoot("hub");
        }
        else
        {
            status.setText("Napačni podatki/uporabnik ne obstaja");
        }
    }
}

