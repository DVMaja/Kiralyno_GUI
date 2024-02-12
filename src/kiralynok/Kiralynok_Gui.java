package kiralynok;

import modell.Tabla;

public class Kiralynok_Gui {

    public static void main(String[] args) {
        new Kiralynok_Gui().feladat();
    }

    private void feladat() {
        Tabla tabla = new Tabla("#");
        tabla.megjelenit();

        System.out.println("Királynők hozzáadaása");
        tabla.elhelyez(8);
        tabla.megjelenit();
        
        //System.out.println(tabla.uresSor(0));
        //System.out.println(tabla.uresOszlop(0));
    }
    
    

}
