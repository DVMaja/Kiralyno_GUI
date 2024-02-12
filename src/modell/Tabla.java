package modell;

import java.util.Random;

public class Tabla {

    private String[][] t;
    private String uresCella;
    private final Random rnd = new Random();

    public Tabla(String uresCella) {
        this.uresCella = uresCella;

        int sor = 8;
        int oszlop = 8;
        this.t = new String[sor][oszlop];

        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                t[i][j] = this.uresCella;
            }
        }
    }

    public void megjelenit() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public String[][] elhelyez(int n) {
        int nDb = 0;
        while (nDb < n) {
            int sor = randomSzam();
            int oszlop = randomSzam();
            if (!t[sor][oszlop].equals("K")) {
                t[sor][oszlop] = "K";
                nDb++;
            }
        }
        return t;
    }

    private int randomSzam() {
        return rnd.nextInt(7 - 0) + 1;
    }

}
