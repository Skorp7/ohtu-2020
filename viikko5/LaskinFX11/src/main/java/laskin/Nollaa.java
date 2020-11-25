
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {
    int ennenNollausta;
    
    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta,  nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        ennenNollausta = sovellus.tulos();
        sovellus.nollaa();    
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
        undo.disableProperty().set(false);
    }  

    @Override
    public void peru() {
        sovellus.plus(ennenNollausta);
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
        undo.disableProperty().set(true);
    }
}
