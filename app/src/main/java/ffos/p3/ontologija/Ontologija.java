package ffos.p3.ontologija;

import java.io.Serializable;

public class Ontologija implements Serializable {

    public Ontologija() {
        this.sifra = sifra;
        this.naziv = naziv;
        this.tip = tip;
        this.opis = opis;
        this.anotacija = anotacija;
    }

    private int sifra;
    private String naziv;
    private String tip;
    private String opis;
    private String anotacija;

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

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getAnotacija() {
        return anotacija;
    }

    public void setAnotacija(String anotacija) {
        this.anotacija = anotacija;
    }
}
