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

    public String toString() {
        return code.toString() + ", coefficient : " + coef;
    }

    public String afficherActe() {
        String s = "Nom : " + this.toString();
        if (!obs.isEmpty()) {
            s += "Observations : " + obs;
        }

        return s;
    }

    public double cout() {
        return code.calculerCout(coef);
    }

    public String coutActe() {
        return "" + code.calculerCout(coef);
    }

//    public String imprimerActe() {
//    }
//
//    public String factureActe() {
//    }
}
