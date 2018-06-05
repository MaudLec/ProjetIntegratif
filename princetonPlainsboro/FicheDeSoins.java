package princetonPlainsboro;

import java.util.ArrayList;

public class FicheDeSoins {

    private Patient patient;
    private Medecin medecin;
    private Date date;
    private ArrayList<Acte> actes;       // contient des objets de classe 'Acte'

    public FicheDeSoins(Patient patient, Medecin medecin, Date date) {
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
        actes = new ArrayList<Acte>();   // liste vide
    }

    public Patient getPatient() {
        return patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Acte> getActes() {
        return actes;
    }

    public Acte getActe(int i) {
        return actes.get(i);
    }
    
    /* Affichage des informations principales de la fiche de soins */
    public String toString() {
        String s = "";
        s += "Patient : " + this.getPatient().getNom().toUpperCase() + " " + this.getPatient().getPrenom() + "\n";
        s += "     Médecin : " + this.getMedecin().toString() + "\n";
        s += "     Date : " + this.getDate().toString();
        return s;
    }

    
    /* Ajouter un acte à la fiche de soins */
    public void ajouterActe(Acte acte) {
        actes.add(acte);
    }

    /* Ajouter un acte à la fiche de soins */
    public void ajouterActe(Code code, int coef, TypeActe typeacte, String obs) {
        Acte acte = new Acte(code, coef, typeacte, obs);
        actes.add(acte);
    }
    
    /* Affichage de toutes les fiches de soins */
    public void ajouterListeActe(ArrayList<Acte> listeActe) {
        for (int i = 0; i < listeActe.size(); i++) {
            this.actes.add(listeActe.get(i));
        }
    }

    /* Affichage de la fiche de soins */
    public String afficher() {
        String s = "Fiche de soins du " + date.toString() + "\n"
                + "- medecin : " + medecin.toString() + "\n"
                + "- patient : " + patient.toString() + "\n"
                + "- actes medicaux :" + "\n";
        for (int i = 0; i < actes.size(); i++) {
            Acte a = actes.get(i);
            s += "    > " + a.toString() + "\n";
        }
        return s;
    }
    
    
    /* Affichage de la fiche de soin pour les secrétaires administratives */ 
    public String afficherPourSecretaireAdmin() {
        String s = "Fiche de soins du " + date.toString() + "\n"
                + "- medecin : " + medecin.toString() + "\n"
                + "- patient : " + patient.toStringAdmin() + "\n"
                + "- actes medicaux :" + "\n";
        for (int i = 0; i < actes.size(); i++) {
            Acte a = actes.get(i);
            s += "    > " + a.toString() + "\n";
        }
            s += "Cout total : " + this.coutTotal();
        return s;
    }

    
    /* Affichage de la fiche de soin avec son cout */
    public String afficherCout() {
        String s = "Fiche de soin de : " + patient.toString()
                + ", fait par : " + medecin.toString()
                + ", le : " + date.toString() + "/n";
        s += "Liste des actes : " + "/n";
        for (int i = 0; i < actes.size(); i++) {
            s += actes.get(i).afficherActe() + "/n";
        }

        s += "Cout total : " + this.coutTotal();

        return s;
    }

    /* Cout total de la fiche de soin */
    public double coutTotal() {
        double total = 0;
        for (int i = 0; i < actes.size(); i++) {
            Acte a = actes.get(i);
            total += a.cout();
        }
        return total;
    }

    /* Affichage toutes les fiches avec les balises XML */
    public String toXML() {
        String s = "<ficheDeSoins>" + date.toXML() + medecin.toXMLCensure() + patient.toXML();
        for (int i = 0; i < actes.size(); i++) {
            s += actes.get(i).toXML();
        }
        s += "</ficheDeSoins>";
        return s;
    }
}
