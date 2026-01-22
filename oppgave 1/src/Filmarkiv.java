public class Filmarkiv {
    public interface FilmarkivADT {
        /**
         * Hente en film med gitt nr fra arkivet
         * @param nr nummer på film som skal hentes.
             * @return film med gitt nr. Om nr ikke finnes, returneres null.
         */
            private Film[] filmer;
            private int antall;

            public Filmarkiv(int kapasitet) {
                filmer = new Film[kapasitet];
                antall = 0;
            }

        @Override
        public Film finnFilm(int nr) {
            for (int i = 0; i < antall; i++) {
                if (filmer[i].getFilmnr() == nr) {
                    return filmer[i];
                }
            }

            return null;
        }

        @Override
        public void leggTilFilm(Film nyFilm) {
                if (antall < filmer.length) {
                    filmer[antall] = nyfilm;
                    antall++;
                }
        }
        /**
         * Legger til en ny film.
         * @param nyFilm
         */
        /**
         * Sletter en fil med gitt nr
         * @param filmnr nr på film som skal slettes
         * @return true dersom filmen ble slettet, false ellers
         */
        @Override
        public boolean slettFilm(int filmnr) {
            for (int i = 0; i < antall; i++) {
                if (filmer[i].getFilmnr() == filmnr) {

                    // Flytter siste film inn på plassen
                    filmer[i] = filmer[antall - 1];
                    filmer[antall - 1] = null;
                    antall--;

                    return true;
                }
            }
            return false;

            /**
             * Søker og henter Filmer med en gitt delstreng i tittelen.
             * @param delstreng som må være i tittel
             * @return tabell med filmer som har delstreng i tittel
             */
            @Override
            public Film[] soekTittel(String delstreng) {
                Film[] treff = new Film[antall];
                int teller = 0;

                for (int i = 0; i < antall; i++) {
                    if (filmer[i].getTittel().toLowerCase()
                            .contains(delstreng.toLowerCase())) {
                        treff[teller++] = filmer[i];
                    }
                }

                return kopierTabell(treff, teller);
            }
            @Override
            public Film[] soekProdusent(String delstreng) {
                Film[] treff = new Film[antall];
                int teller = 0;

                for (int i = 0; i < antall; i++) {
                    if (filmer[i].getProdusent().toLowerCase()
                            .contains(delstreng.toLowerCase())) {
                        treff[teller++] = filmer[i];
                    }
                }

                return kopierTabell(treff, teller);
            }

            @Override
            public int antall(Sjanger sjanger) {
                int teller = 0;

                for (int i = 0; i < antall; i++) {
                    if (filmer[i].getSjanger() == sjanger) {
                        teller++;
                    }
                }
                return teller;
            }

            @Override
            public int antall() {
                return antall;
            }

            // Hjelpemetode for å lage tabell med riktig lengde
            private Film[] kopierTabell(Film[] tabell, int lengde) {
                Film[] ny = new Film[lengde];
                for (int i = 0; i < lengde; i++) {
                    ny[i] = tabell[i];
                }
                return ny;
            }
        }
    }
}
