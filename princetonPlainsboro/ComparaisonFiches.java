package princetonPlainsboro;

// cette interface permet de representer une comparaison entre deux FicheDeSoins
interface ComparaisonFiches {
    // la fonction 'comparer' doit retourner :
    //    <0  si fiche1 < fiche2
    //     0  si fiche1 == fiche2
    //    >0  si fiche1 > fiche2
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2);
}
