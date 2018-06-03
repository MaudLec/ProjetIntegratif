package princetonPlainsboro;

import java.util.ArrayList;

class FicheDeSoins {

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

    public void ajouterActe(Acte acte) {
        actes.add(acte);
    }

    public void ajouterActe(Code code, int coef, TypeActe typeacte, String obs) {
        Acte acte = new Acte(code, coef, typeacte, obs);
        actes.add(acte);
    }

    public void ajouterListeActe(ArrayList<Acte> listeActe) {
        for (int i = 0; i < listeActe.size(); i++) {
            this.actes.add(listeActe.get(i));
        }
    }

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

    public String afficherCout() {
        String s = "Fiche de soin de : " + patient.toString()
                + ", fait par : " + medecin.toString()
                + ", le : " + date.afficherDate() + "/n";
        s += "Liste des actes : " + "/n";
        for (int i = 0; i < actes.size(); i++) {
            s += actes.get(i).afficherActe() + "/n";
        }
        
        s+="Cout total : "+this.coutTotal();

        return s;
    }

    public double coutTotal() {
        double total = 0;
        for (int i = 0; i < actes.size(); i++) {
            Acte a = actes.get(i);
            total += a.cout();
        }
        return total;
    }
    public String toXML(){
        String s = "<ficheDeSoins>" + date.toXML() + medecin.toXMLCensure()+ patient.toXML();
        for(int i = 0; i<actes.size(); i++) {
            s+=actes.get(i).toXML();
        }
        s+="</ficheDeSoins>";
        return s;
    }
}

