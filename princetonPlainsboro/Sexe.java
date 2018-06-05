package princetonPlainsboro;

public enum Sexe {
    M,
    F,
    Autre;

    /* Affichage du sexe avec la balise XML */
    public String toXML() {
        return ("<sexe>" + this.name() + "</sexe>");
    }
}
