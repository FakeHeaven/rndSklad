package sample;

import javafx.event.ActionEvent;

import java.io.IOException;

public class konecController {
    public void zakljuciCB(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void ponovnoCB(ActionEvent actionEvent) throws IOException {
        Main.setRoot("hub");
    }
}
