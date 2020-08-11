package ffos.p3.ontologija;

import java.io.Serializable;

public class Ontologija implements Serializable {

    public Ontologija() {
        this.sifra = sifra;
        this.naziv = naziv;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    private int sifra;
    private String naziv;
}
