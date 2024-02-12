package kiralynok;

import java.io.IOException;
import modell.Fajl;
import modell.Tabla;

public class Kiralynok_Gui {

    public static void main(String[] args) throws IOException {
        new Kiralynok_Gui().feladat();
    }

    private void feladat() throws IOException {
        Tabla tabla = new Tabla("#");
        Fajl f = new Fajl(64);
        System.out.println(tabla.megjelenit());

        System.out.println("Királynők hozzáadaása");
        tabla.elhelyez(8);
        System.out.println(tabla.megjelenit());
        //f.fajlbaKiir();
        //Leakad 50-nél

        System.out.println(tabla.uresSor(0));
        System.out.println(tabla.uresOszlop(0));
    }

}
