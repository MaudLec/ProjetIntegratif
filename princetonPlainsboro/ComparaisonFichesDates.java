package princetonPlainsboro;

class ComparaisonFichesDates implements ComparaisonFiches {
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2) {
        return fiche1.getDate().compareTo(fiche2.getDate());
        }
    }
