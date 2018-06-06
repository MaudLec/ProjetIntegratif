package princetonPlainsboro;

public enum Sexe {
    M,
    F,
    Autre;
    
        public static Sexe getSexe(String s) {
        if (s.equals("F")) {
            return Sexe.F;
        }
        if (s.equals("M")) {
            return Sexe.M;
        }
        if (s.equals("Autre")) {
            return Sexe.Autre;
        }

        return null;
    }

    /* Affichage du sexe avec la balise XML */
    public String toXML() {
        return ("<sexe>" + this.name() + "</sexe>");
    }
}
