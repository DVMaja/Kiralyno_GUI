package kiralynok;

import java.io.IOException;
import modell.Fajl;
import modell.Tabla;
import nezet.Gui;
import vezerlo.KiralynoGuiVez;

public class Kiralynok_Gui {

    public static void main(String[] args) throws IOException {
        new Kiralynok_Gui().feladat();
    }

    private void feladat() throws IOException {
        //konzolra();
        guihoz();
    }

    private void guihoz() {
        Gui nezet = new Gui();
        nezet.setVisible(true);
        Tabla modell = new Tabla("#");
        new KiralynoGuiVez(nezet, modell);
    }

    private void konzolra() {
        Tabla tabla = new Tabla("#");
        Fajl f = new Fajl(64);
        System.out.println(tabla.megjelenit());

        System.out.println("Királynők hozzáadaása");
        tabla.elhelyez(8);
        System.out.println(tabla.megjelenit());
        //f.fajlbaKiir();
        //Leakad 50-nél

        System.out.println("Üres e a sor: " + tabla.uresSor(0));
        System.out.println("Üres e az oszlop: " + tabla.uresOszlop(0));
        System.out.println("Üres sorok száma: " + tabla.uresSorokSzama());
        System.out.println("Üres oszlopok száma: " + tabla.uresOszlopokSzama());
    }

}
