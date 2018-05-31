package princetonPlainsboro;

import java.util.ArrayList;

class Medecin extends Personne {

    private Specialite specialite;
    private ArrayList<Integer> numtel;

    public Medecin(String nom, String prenom, Sexe sexe, Date naissance, int numid, Specialite specialite, ArrayList<Integer> numtel) {
        super(nom, prenom, sexe, naissance, numid);
        this.specialite = specialite;
        if (numtel.size()==10) this.numtel=new ArrayList<Integer>();
        
    }
    
    public String getNom() {
        return this.nom;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public String toString() {
        return "Dr " + prenom + " " + nom + ", " + specialite;
    }

    public boolean equals(Object o) {
        if (o instanceof Medecin) {
            Medecin p = (Medecin) o;
            return nom.equals(p.nom) && prenom.equals(p.prenom);
        } else {
            return false;
        }
    }
    
}


