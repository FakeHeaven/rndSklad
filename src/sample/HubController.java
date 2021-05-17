package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HubController implements Initializable {
    public TableView tvTabela;
    public TextField tfCena;
    public Button bDodaj;
    public Spinner sKolicina;
    public Button bNaroci;
    public TableView tvTabela1;
    public TableColumn<Zaloga, String> imeIzdelkaColumn;
    public TableColumn<Zaloga, Integer>  zalogaColumn;
    public TableColumn<Zaloga, Integer>  cenaColumn;
    public Label lMax;
    public TableColumn<Narocilo, String> imeIzdelkaNarocilo;
    public TableColumn<Narocilo, Integer> kolicinaIzdelkaNarocilo;
    public TableColumn<Narocilo, Integer> cenaIzdelkaNarocilo;
    public Integer cena = 0;
    public Label lCena;
    private ObservableList<Zaloga> zalogaData = FXCollections.observableArrayList();
    private ObservableList<Narocilo> narociloData = FXCollections.observableArrayList();

    public void initialize(URL url, ResourceBundle resourceBundle) {
        zalogaData.add(new Zaloga("iPhone 12", 260, 600));
        zalogaData.add(new Zaloga("iPhone X", 100, 400));
        zalogaData.add(new Zaloga("iPhone SE", 40, 500));
        zalogaData.add(new Zaloga("Samsung Galaxy S12", 35, 900));
        zalogaData.add(new Zaloga("PS5", 14, 499));
        imeIzdelkaColumn.setCellValueFactory(cellData -> cellData.getValue().imeIzdelkaProperty());
        zalogaColumn.setCellValueFactory(cellData -> cellData.getValue().zalogaIzdelkaProperty().asObject());
        cenaColumn.setCellValueFactory(cellData -> cellData.getValue().cenaIzdelkaProperty().asObject());
        tvTabela1.setItems(getIzdelekData());

        imeIzdelkaNarocilo.setCellValueFactory(cellData -> cellData.getValue().imeIzdelkaProperty());
        kolicinaIzdelkaNarocilo.setCellValueFactory(cellData -> cellData.getValue().zalogaIzdelkaProperty().asObject());
        cenaIzdelkaNarocilo.setCellValueFactory(cellData -> cellData.getValue().cenaIzdelkaProperty().asObject());
        tvTabela.setItems(getNarociloData());

        tvTabela1.setOnMouseClicked((MouseEvent event) -> {
            if (event.getClickCount() > 1) {
                onClick();
            }
        });
    }

    public void onClick() {
        if (tvTabela1.getSelectionModel().getSelectedItem() != null) {
            Zaloga selectedPerson = (Zaloga) tvTabela1.getSelectionModel().getSelectedItem();
            lMax.setText("(Max: " + selectedPerson.getZalogaIzdelka() + ")");
            SpinnerValueFactory svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, selectedPerson.getZalogaIzdelka());
            sKolicina.setValueFactory(svf);
        }
    }

    public ObservableList<Zaloga> getIzdelekData() {
        return zalogaData;
    }
    public ObservableList<Narocilo> getNarociloData() {
        return narociloData;
    }

    public void dodajIzdelek(ActionEvent actionEvent) {
        tvTabela1.setItems(getIzdelekData());
        if (tvTabela1.getSelectionModel().getSelectedItem() != null) {
            Zaloga selectedPerson = (Zaloga) tvTabela1.getSelectionModel().getSelectedItem();
            narociloData.add(new Narocilo(selectedPerson.getImeIzdelka(), (Integer) sKolicina.getValue() ,selectedPerson.getCenaIzdelka()));
            cena += (Integer) sKolicina.getValue() * selectedPerson.getCenaIzdelka();
            lCena.setText(cena + "€");
        }
    }

    public void naroci(ActionEvent actionEvent) throws IOException {
        Main.setRoot("end");
    }

    public void preklici(ActionEvent actionEvent) {
        System.exit(0);
    }
}
