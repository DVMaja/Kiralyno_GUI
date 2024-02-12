package kiralynok;

public class Tabla {

    private String[][] t;
    private String uresCella;

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

}
