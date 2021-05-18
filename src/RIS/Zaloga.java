package RIS;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Zaloga {
    private final StringProperty imeIzdelka;
    private final IntegerProperty zalogaIzdelka;
    private final IntegerProperty cenaIzdelka;



    public Zaloga() {
        this(null, 0, 0);
    }


    public Zaloga(String imeIzdelka, Integer zalogaIzdelka, Integer cenaIzdelka) {
        this.imeIzdelka = new SimpleStringProperty(imeIzdelka);
        this.zalogaIzdelka = new SimpleIntegerProperty(zalogaIzdelka);
        this.cenaIzdelka = new SimpleIntegerProperty(cenaIzdelka);
    }

    public String getImeIzdelka() {
        return imeIzdelka.get();
    }

    public void setImeIzdelka(String imeIzdelka) {
        this.imeIzdelka.set(imeIzdelka);
    }

    public StringProperty imeIzdelkaProperty() {
        return imeIzdelka;
    }

    public int getZalogaIzdelka() {
        return zalogaIzdelka.get();
    }

    public void setZalogaIzdelka(Integer zalogaIzdelka) {
        this.zalogaIzdelka.set(zalogaIzdelka);
    }

    public IntegerProperty zalogaIzdelkaProperty() {
        return zalogaIzdelka;
    }

    public int getCenaIzdelka() {
        return cenaIzdelka.get();
    }

    public void setCenaIzdelka(Integer cenaIzdelka) {
        this.cenaIzdelka.set(cenaIzdelka);
    }

    public IntegerProperty cenaIzdelkaProperty() {
        return cenaIzdelka;
    }

}
