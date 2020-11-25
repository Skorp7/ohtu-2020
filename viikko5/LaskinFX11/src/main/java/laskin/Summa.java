
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Summa extends Komento {
    
    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta,  nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        sovellus.plus(Integer.parseInt(syotekentta.getText()));
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
        undo.disableProperty().set(false);
    }  

    @Override
    public void peru() {
        sovellus.miinus(Integer.parseInt(syotekentta.getText()));
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
        undo.disableProperty().set(true);
    }
}
