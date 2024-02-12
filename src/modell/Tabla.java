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

    public String megjelenit() {
        //majd még átalakítando a Gui hoz
        String kimeno = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                kimeno += t[i][j] + " ";
            }
            kimeno += "\n";
        }
        return kimeno;
    }

    public void elhelyez(int n) {
        int nDb = 0;
        while (nDb < n) {
            int sor = randomSzam();
            int oszlop = randomSzam();
            if (!t[sor][oszlop].equals("K")) {
                t[sor][oszlop] = "K";
                nDb++;
            }
        }
    }

    private int randomSzam() {
        return rnd.nextInt(7 - 0) + 1;
    }

    public boolean uresSor(int sor) {
        int db = 0;

        while (db < 8 && !(t[sor][db].equals("K"))) {
            db++;
        }
        return db >= 8;
    }

    public boolean uresOszlop(int oszlop) {
        int db = 0;

        while (db < 8 && !(t[db][oszlop].equals("K"))) {
            db++;
        }
        return db >= 8;
    }

    public int uresSorokSzama() {
        int uresSorokDb = 0;

        for (int sor = 0; sor < 8; sor++) {
            if (uresSor(sor)) {
                uresSorokDb++;
            }
        }
        return uresSorokDb;
    }

    public int uresOszlopokSzama() {
        int uresOszlopokDb = 0;

        for (int oszlop = 0; oszlop < 8; oszlop++) {
            if (uresOszlop(oszlop)) {
                uresOszlopokDb++;
            }
        }
        return 1;
    }

}
