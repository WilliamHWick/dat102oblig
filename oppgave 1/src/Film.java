import java.util.Objects;
public class Film {
private int filmnr;
private String produsent;
private String tittel;
private int aar;
private Sjanger sjanger;
private String filmselskap;

public Film(){
}

public Film (int filmnr, String produsent,String tittel, int aar, Sjanger sjanger, String filmselskap){
    this.filmnr=filmnr;
    this.produsent=produsent;
    this.tittel=tittel;
    this.aar=aar;
    this.sjanger=sjanger;
    this.filmselskap=filmselskap;
}
    public int getFilmnr() { return filmnr; }
    public void setFilmnr(int filmnr) { this.filmnr = filmnr; }

    public String getProdusent() { return produsent; }
    public void setProdusent(String produsent) { this.produsent = produsent; }

    public String getTittel() { return tittel; }
    public void setTittel(String tittel) { this.tittel = tittel; }

    public int getAar() { return aar; }
    public void setAar(int aar) { this.aar = aar; }

    public Sjanger getSjanger() { return sjanger; }
    public void setSjanger(Sjanger sjanger) { this.sjanger = sjanger; }

    public String getFilmselskap() { return filmselskap; }
    public void setFilmselskap(String filmselskap) { this.filmselskap = filmselskap; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Film other = (Film) obj;
        return this.filmnr == other.filmnr;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(filmnr);
    }

}

