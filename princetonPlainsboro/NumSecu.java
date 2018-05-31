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
    
    public long toString() { 
        return numero + " " + cle;
    }

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
}
