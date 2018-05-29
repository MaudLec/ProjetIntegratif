package princetonPlainsboro;

class Acte {
    private Code code;
    private int coef;
    
    public Acte(Code code, int coef) {
        this.code = code;
        this.coef = coef;
        }
    
    public String toString() {
        return code.toString() + ", coefficient : " + coef;
        }
    
    public double cout() {
        return code.calculerCout(coef);
        }
    }
