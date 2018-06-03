package princetonPlainsboro;

class Acte {

    private Code code;
    private int coef;
    private TypeActe type;
    private String obs;

    public Acte(Code code, int coef, TypeActe type, String obs) {
        this.code = code;
        this.coef = coef;
        this.type = type;
        this.obs = obs;
    }

    public Acte(Code code, int coef) {
        this.code = code;
        this.coef = coef;
        type = null;
        obs = null;
    }

    public Code getCode() {
        return code;
    }

    public int getCoef() {
        return coef;
    }

    public TypeActe getType() {
        return type;
    }

    public String getObs() {
        return obs;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public void setType(TypeActe type) {
        this.type = type;
    }

    public void setObs(String observation) {
        this.obs = observation;
    }

    /* Affichage du code et du coef de l'acte */
    public String toString() {
        return code.toString() + ", coefficient : " + coef;
    }

    /* Affichage de l'acte & des oservations s'il y en a */
    public String afficherActe() {
        String s = "Nom : " + this.toString() + ", Type : " + type;
        if (!obs.isEmpty()) {
            s += "Observations : " + obs;
        }

        return s;
    }

    /* Calcul du coup de l'acte */
    public double cout() {
        return code.calculerCout(coef);
    }

    /* Affichage pour la classe Ecriture XML */
     public String toXML(){
        return("<acte>" + code.toXML() + "<coef>" + coef + "</coef>" + type.toXML() + "<cout>" + this.cout() + "</cout><observation>" + obs + "</observation></acte>" );
    }

//    public String imprimerActe() {
//    }
//
//    public String factureActe() {
//    }
}
