public interface FilmarkivADT {

    /**
     * Henter film med gitt nummer.
     */
    Film finnFilm(int nr);

    /**
     * Legger til ny film i arkivet.
     */
    void leggTilFilm(Film nyFilm);

    /**
     * Sletter film med gitt nummer.
     */
    boolean slettFilm(int filmnr);

    Film[] soekTittel(String delstreng);

    Film[] soekProdusent(String delstreng);

    int antall(Sjanger sjanger);

    int antall();
}
