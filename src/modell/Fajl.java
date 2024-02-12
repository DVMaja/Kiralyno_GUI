package modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Fajl {

    private int dbSzam;

    public Fajl(int dbSzam) {
        this.dbSzam = dbSzam;

    }

    public void fajlbaKiir() throws IOException {
        Path fajl = Path.of("tablak64.txt");
        String kiirando = "";

        if (!Files.exists(fajl)) {

            for (int db = 0; db < this.dbSzam; db++) {
                Tabla t = new Tabla("*");
                t.elhelyez(db);
                kiirando += t.megjelenit() + "\n";
                System.out.println(db);
                System.out.println(kiirando);
                 Files.write(fajl, kiirando.getBytes());

            }
           
        } else {
            Files.delete(fajl);
        }
    }
}
