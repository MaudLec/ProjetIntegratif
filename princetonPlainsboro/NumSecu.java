/**
 *
 * @author Julie Dubois, Suzanne Guegaden, Maud Leclerc, Vaea Tesan
 */
package princetonPlainsboro;

import java.util.ArrayList;


public class NumSecu {
//    private ArrayList<Integer> numSecu;
    private int sexe;
    private int annee;
    private int mois;
    private int dep;
    private int comm;
    private int reg;
    private int cle;
    private long numero;
    //ce serait bien de bloquer le nombre de caractères autorisés dans l'IU
    public NumSecu(int sexe, int annee, int mois, int dep, int comm, int reg, int cle){
        this.sexe = sexe;
        this.annee = annee;
        this.mois = mois;
        this.dep = dep;
        this.comm = comm;
        this.reg = reg;
        this.cle = cle;
        this.numero = reg*1L + comm*1000L + dep*1000000L + mois*100000000L + annee*10000000000L + sexe*1000000000000L;
    }
    
         public NumSecu(String s) {
this.sexe = Integer.parseInt(""+s.charAt(0));
this.annee = Integer.parseInt(""+s.charAt(2)) * 10 + Integer.parseInt(""+s.charAt(3)) * 1;
this.mois = Integer.parseInt(""+s.charAt(5)) * 10 + Integer.parseInt(""+s.charAt(6)) * 1;
this.dep  = Integer.parseInt(""+s.charAt(8)) * 10 + Integer.parseInt(""+s.charAt(9)) * 1;
this.comm = Integer.parseInt(""+s.charAt(11)) * 100 + Integer.parseInt(""+s.charAt(12)) * 10 + Integer.parseInt(""+s.charAt(13)) * 1;
this.reg  = Integer.parseInt(""+s.charAt(15)) * 100 + Integer.parseInt(""+s.charAt(16)) * 10 + Integer.parseInt(""+s.charAt(17)) * 1;
this.cle = Integer.parseInt(""+s.charAt(19)) * 10 + Integer.parseInt(""+s.charAt(20)) * 1;

    }

    
    /* Affichage du numéro SS avec sa clé avec des O quand nb < 10*/
    public String toString() {
        String s = "" + sexe;
        if (annee < 10) { s += "0" + annee; } else { s += annee; }
        if (mois < 10) { s += "0" + mois; } else { s += mois; }
        if (dep < 10) { s += "0" + dep; } else { s += dep; }
        if (comm < 100 && comm > 10) { s += "0" + comm; } else { if (comm < 10) { s+= "00" + comm ; } else { s += comm; }}
        if (reg < 100 && reg > 10) { s += "0" + reg; } else { if (reg < 10) { s+= "00" + reg; }else { s += reg ; }}
        if (cle < 10) { s += " 0" + cle; } else { s += " " + cle; }

        return s;
    }
    
    /* Renvoie vrai si les deux numéros de SS avec la clé sont égaux, renvoie faux sinon */
    public boolean equals(Object o) {
                if (o instanceof NumSecu) {
            NumSecu ns = (NumSecu)o;
                    return (numero == ns.numero) && (cle == ns.cle) ; 
                } 
        else 
            return false;
    }
        
        /* Vérifie si le numéro de SS est valide, ainsi que la clé */
    public boolean numCorrect(){
        if(this.sexe<1 || this.sexe>2){ //le sexe doit etre egal a 1 ou 2
            System.out.println("sexe");
            return false;
        }
        if(this.mois<=0||this.mois>12){ //le mois est compris entre 1 et 12
            System.out.println("mois");
            return false;
        }
        if(this.dep<=0 || this.dep>=99){ //vérification que le departement n'est pas 00 ou 99
            System.out.println("dep");
            return false;
        }
        if(this.comm<=0 || this.comm>999){ //verification que la commune n'est pas egale a 000
            System.out.println("commune");
            return false;
        }
        long c = (97L - (this.numero % 97L));
        if (this.cle != c){//verification de la cle
            System.out.println("clé");
            return false;
        }
        System.out.println("ok");
        return true;
            }
        /* Affichage du numéro SS avec sa clé avec les balises XML */
     /* Affichage du numéro SS avec sa clé avec les balises XML */
    public String toXML(){
        return ("<numsecu>" + "<sexesecu>" + sexe + "</sexesecu>" + "<annee>" + annee + "</annee>" + "<mois>" + mois + "</mois>" + "<dep>" + dep + "</dep>" + "<comm>" + comm + "</comm>" + "<reg>" + reg + "</reg>" + "<cle>" + cle + "</cle>" + "</numsecu>");
    }
    
     public String toFormatted() {
        String s = "" + sexe;
        if (annee < 10) {
            s += "-0" + annee;
        } else {
            s += "-" + annee;
        }
        if (mois < 10) {
            s += "-0" + mois;
        } else {
            s += "-" + mois;
        }
        if (dep < 10) {
            s += "-0" + dep;
        } else {
            s += "-" + dep;
        }
        if (comm < 100 && comm > 10) {
            s += "-0" + comm;
        } else {
            if (comm < 10) {
                s += "-00" + comm;
            } else {
                s += "-" + comm;
            }
        }
        if (reg < 100 && reg > 10) {
            s += "-0" + reg;
        } else {
            if (reg < 10) {
                s += "-00" + reg;
            } else {
                s += "-" + reg;
            }
        }
        if (cle < 10) {
            s += "-0" + cle;
        } else {
            s += "-" + cle;
        }
        return s;
    }
}
