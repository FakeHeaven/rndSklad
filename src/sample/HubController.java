package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HubController implements Initializable {
    public ListView lvDisplay;
    public TableView tvTabela;
    public TextField tfCena;
    public Button bDodaj;
    public Spinner sKolicina;
    public Button bNaroci;
    public TableView tvTabela1;
    public TableColumn<Izdelek, String> imeIzdelkaColumn;
    public TableColumn<Izdelek, Integer>  zalogaColumn;
    public TableColumn<Izdelek, Integer>  cenaColumn;
    private ObservableList<Izdelek> izdelekData = FXCollections.observableArrayList();

    public void initialize(URL url, ResourceBundle resourceBundle) {
        izdelekData.add(new Izdelek("iPhone 12", 260, 600));
        izdelekData.add(new Izdelek("iPhone X", 100, 400));
        izdelekData.add(new Izdelek("iPhone SE", 40, 500));
        izdelekData.add(new Izdelek("Samsung Galaxy S12", 35, 900));
        izdelekData.add(new Izdelek("PS5", 14, 499));
        imeIzdelkaColumn.setCellValueFactory(cellData -> cellData.getValue().imeIzdelkaProperty());
        zalogaColumn.setCellValueFactory(cellData -> cellData.getValue().zalogaIzdelkaProperty().asObject());
        cenaColumn.setCellValueFactory(cellData -> cellData.getValue().cenaIzdelkaProperty().asObject());
        tvTabela1.setItems(getIzdelekData());
    }

    public ObservableList<Izdelek> getIzdelekData() {
        return izdelekData;
    }
}
