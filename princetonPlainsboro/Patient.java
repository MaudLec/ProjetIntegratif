package princetonPlainsboro;

import java.util.ArrayList;

class Patient extends Personne {

    private NumSecu numsecu;
    private String adresse;

    public Patient(String nom, String prenom, Sexe sexe, Date naissance, int numid, NumSecu numsecu, String adresse) {
        super(nom, prenom, sexe, naissance, numid);
        this.numsecu = numsecu;
        this.adresse = adresse;

    }

    public String getNom() {
        return this.nom;
    }

    public String toString() {
        String s = prenom + " " + nom + ", ";
        if (sexe == Sexe.F) {
            s += "femme";
        } else {
            s += "homme";
        }
        return s;
    }

    public boolean equals(Object o) {
        if (o instanceof Patient) {
            Patient p = (Patient) o;
            return nom.equals(p.nom) && prenom.equals(p.prenom);
        } else {
            return false;
        }
    }

}
