package princetonPlainsboro;
//maud
import java.util.ArrayList;

public class DossierMedical {

    private ArrayList<FicheDeSoins> fiches; // contient des objets de classe 'FicheDeSoins'
    private ArrayList<Medecin> medecins;
    private ArrayList<Patient> patients;
    //private ArrayList<FicheDeSoins> dossierPatient;
    private LectureXML lect;

    public DossierMedical() {
        fiches = new ArrayList<FicheDeSoins>();  // liste vide
        medecins = new ArrayList<Medecin>();
        patients = new ArrayList<Patient>();
        // dossierPatient = new ArrayList<FicheDeSoins>();
        lect = new LectureXML("dossiers.xml");
    }

    public ArrayList<Medecin> getMedecins() {
        return medecins;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<FicheDeSoins> getFiches() {
        return fiches;
    }

    public FicheDeSoins getFiche(int i) {
        return fiches.get(i);
    }

    /* Ajout d'une fiche de soins */
    public void ajouterFiche(FicheDeSoins fiche) {
        fiches.add(fiche);
    }

    /* Ajout d'un patient */
    public String ajouterPatient(Patient p) {
        String s = "";
        if (patients.contains(p)) {
            s += "Le patient est déjà dans la liste";
        } else {
            patients.add(p);
            s += "Le patient a bien été ajouté";

        }
        return s;
    }

    /* Ajout d'un médecin */
    public String ajouterMedecin(Medecin m) {
        String s = "";
        if (medecins.contains(m)) {
            s += "Le médecin est déjà dans la liste";
        } else {
            medecins.add(m);
            s += "Le médecin a bien été ajouté";

        }
        return s;
    }

    /* Affichage de toutes les fiches de soins */
    public String afficherToutesFiches() {
        String s = "Dossier medical informatise :" + "\n"
                + "-----------------------------";
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            s += f.afficher();
            // pour separer les fiches de soins :
            s += "\n --------------------------------------";
        }
        return s;
    }

    /* Affichage de toutes les fiches de soins pour un patient */
    public String afficherDossierPatient(Patient p) {
        String s = "Dossier medical informatise :" + "\n"
                + "-----------------------------" + "\n";
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            if (f.getPatient().equals(p)) {
                s += f.afficher();
                // pour separer les fiches de soins :
                s += "--------------------------------------";
            }
        }
        return s;
    }

     public ArrayList<FicheDeSoins> listeFichesSpe(Specialite spe) {
        ArrayList<FicheDeSoins> listeFichesSpe = new ArrayList<FicheDeSoins>();
        for (int i = 0; i < fiches.size(); i++) {
            if (fiches.get(i).getMedecin().getSpecialite().equals(spe)) {
                listeFichesSpe.add(fiches.get(i));
            }
        }
        return listeFichesSpe;
    }
     

         public ArrayList<FicheDeSoins> listeFichesActe(Acte acte) {
        ArrayList<FicheDeSoins> listeFichesActe = new ArrayList<FicheDeSoins>();
        for (int i = 0; i < fiches.size(); i++) {
            for (int j = 0; j < fiches.get(i).getActes().size(); j++) {
                if (fiches.get(i).getActe(j).equals(acte)) {
                    listeFichesActe.add(fiches.get(i));
                    j = fiches.get(i).getActes().size();
                }
            }

        }
        return listeFichesActe;
    }
     
    /* Renvoi d'une liste contennant toutes les fiches de soins d'un patient*/
    public ArrayList<FicheDeSoins> listeDossierPatient(Patient p) {
        ArrayList<FicheDeSoins> listeFichesDeSoins = new ArrayList<FicheDeSoins>();
        for (int i = 0; i < fiches.size(); i++) {
            if (fiches.get(i).getPatient().equals(p)) {
                listeFichesDeSoins.add(fiches.get(i));
            }
        }
        return listeFichesDeSoins;
    }


    /* Cout total pour un patient */
    public double coutPatient(Patient p) {
        double cout = 0;
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            if (f.getPatient().equals(p)) {
                cout += f.coutTotal();
            }
        }
        return cout;
    }

    /* Cout total pour un médecin  */
    public double coutMedecin(Medecin m) {
        double cout = 0;
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            if (m.equals(f.getMedecin())) {
                cout += f.coutTotal();
            }
        }
        return cout;
    }

    /* Cout total pour une spécialité */
    public double coutSpecialite(String specialite) {
        double cout = 0;
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            if (specialite.equals(f.getMedecin().getSpecialite().toString())) {
                cout += f.coutTotal();
            }
        }
        return cout;
    }

    /* Cout total de toutes les fiches de soins confondues */
    public double coutTotal() {
        double cout = 0;
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);

            cout += f.coutTotal();

        }
        return cout;

    }

    /* Affichage de tous les patients pour un médecin */
    public String afficherListePatients(Medecin m) {
        String s = "> liste des patients du " + m.toString() + " :" + "\n";
        ArrayList<Patient> liste = new ArrayList<Patient>();
        // 'liste' contient tous les patients deja affiches
        // --> ceci permet de ne pas reafficher un patient deja affiche
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            if (m.equals(f.getMedecin())) {
                Patient p = f.getPatient();
                if (!liste.contains(p)) {
                    s += " - " + p.toString() + "\n";
                    liste.add(p);
                }
            }
        }
        return s;
    }

    /*recuperer la liste des patients d un medecin*/
    public ArrayList<Patient> recupererListePatients(Medecin m) {
        ArrayList<Patient> liste = new ArrayList<Patient>();
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            if (m.equals(f.getMedecin())) {
                Patient p = f.getPatient();
                if (!liste.contains(p)) {
                    liste.add(p);
                }
            }
        }
        return liste;
    }


    /* Affichage de tous les patients */
    public String afficherTousPatients() {
        String s = "> liste de tous les patients : " + "\n";
        for (int i = 0; i < fiches.size(); i++) {
            if (!patients.contains(fiches.get(i).getPatient())) {
                patients.add(fiches.get(i).getPatient());
            }
        }
        for (int i = 0; i < patients.size(); i++) {
            s += "- " + patients.get(i).toString() + "\n";
        }
        return s;
    }

    /* Affichage de tous les médecins pour un patient (numéro ss) */
    public String afficherListeMedecins(NumSecu ns) {
        String s = "> liste des médecins de " + ns.toString() + " :" + "\n";
        ArrayList<Medecin> liste = new ArrayList<Medecin>();
        // 'liste' contient tous les medecins deja affiches
        // --> ceci permet de ne pas reafficher un medecin deja affiche
        for (int i = 0; i < fiches.size(); i++) {
            Patient p = fiches.get(i).getPatient();
            Medecin m = fiches.get(i).getMedecin();
            if (ns.equals(p.getNumSecu())) {
                s += " - " + m.toString() + "\n";
                liste.add(m);
            }
        }
        return s;
    }

    public ArrayList<Medecin> listeMedecinsParPatientNs(NumSecu ns) {
        ArrayList<Medecin> listeMedecins = new ArrayList<Medecin>();
        for (int i = 0; i < fiches.size(); i++) {
            if (ns.equals(fiches.get(i).getPatient().getNumSecu())) {
                listeMedecins.add(fiches.get(i).getMedecin());
            }
        }
        return listeMedecins;
    }

    /* Affichage de tous les médecins pour un patient */
    public String afficherListeMedecins(Patient p) {
        String s = "> liste des médecins de " + p.toString() + " :" + "\n";
        ArrayList<Medecin> liste = new ArrayList<Medecin>();
        // 'liste' contient tous les medecins deja affiches
        // --> ceci permet de ne pas reafficher un medecin deja affiche
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            if (p.equals(f.getPatient())) {
                Medecin m = f.getMedecin();
                if (!liste.contains(m)) {
                    s += " - " + m.toString() + "\n";
                    liste.add(m);
                }
            }
        }
        return s;
    }

    public ArrayList<Medecin> listeMedecinsParPatient(Patient p) {
        ArrayList<Medecin> listeMedecinsPatient = new ArrayList<Medecin>();
        for (int i = 0; i < fiches.size(); i++) {
            if (fiches.get(i).getPatient().equals(p)) {
                listeMedecinsPatient.add(fiches.get(i).getMedecin());
            }
        }
        return listeMedecinsPatient;
    }

    /* Affichage de tous les médecins pour une spécialité */
    public String afficherListeMedecinsSpe(Specialite spe) {
        String s = "> liste des médecins de spécialité " + spe.toString() + " :" + "\n";
        ArrayList<Medecin> liste = new ArrayList<Medecin>();
        // 'liste' contient tous les medecins deja affiches
        // --> ceci permet de ne pas reafficher un medecin deja affiche
        for (int i = 0; i < medecins.size(); i++) {
            Specialite spec = medecins.get(i).getSpecialite();
            if (spec.equals(spe)) {
                Medecin m = medecins.get(i);
                if (!liste.contains(m)) {
                    s += " - " + m.toString() + "\n";
                    liste.add(m);
                }
            }
        }
        return s;
    }

    public ArrayList<Medecin> listeMedecinsSpe(Specialite spe) {
        ArrayList<Medecin> listeMedecinsSpe = new ArrayList<Medecin>();
        for (int i = 0; i < medecins.size(); i++) {
            if (medecins.get(i).getSpecialite().equals(spe)) {
                listeMedecinsSpe.add(medecins.get(i));
            }
        }
        return listeMedecinsSpe;
    }

    /* Affichage de tous les médecins */
    public String afficherTousMedecins() {
        String s = "> liste de tous les médecins : " + "\n";
        for (int i = 0; i < fiches.size(); i++) {
            if (!medecins.contains(fiches.get(i).getMedecin())) {
                medecins.add(fiches.get(i).getMedecin());
            }
        }
        for (int i = 0; i < medecins.size(); i++) {
            s += "- " + medecins.get(i).toString() + "\n";
        }
        return s;
    }

    /* Donne le nombre de fiches entre un intervalle de dates */
    public int nombreFichesIntervalle(Date d1, Date d2) {
        int n = 0;
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            Date d = f.getDate();
            if (d.compareTo(d1) >= 0 && d.compareTo(d2) <= 0) {
                n++;
            }
        }
        return n;
    }

    /* Affichage des fiches de soins triées par date */
    public String trierDates() {
        ArrayList<FicheDeSoins> copieFiches = new ArrayList<FicheDeSoins>(fiches);
        String s = "";

        while (!copieFiches.isEmpty()) {
            // on cherche la fiche de soins de date minimale :
            int imin = 0;
            FicheDeSoins f1 = copieFiches.get(imin);
            for (int i = 1; i < copieFiches.size(); i++) {
                FicheDeSoins f2 = copieFiches.get(i);
                if (f2.getDate().compareTo(f1.getDate()) < 0) {
                    imin = i;
                    f1 = f2;
                }
            }
            // on affiche la fiche de soins trouvee :
            s += f1.afficher();
            s += "------------------------" + "\n";
            //on la supprime de la liste :
            copieFiches.remove(imin);
        }
        return s;
    }

    /*tri des fiches selon la date décroissante*/
    public void trierDatesDecroissantes() {
        for (int k = 0; k < fiches.size(); k++) {
            for (int j = k + 1; j < fiches.size(); j++) {
                if (fiches.get(k).getDate().compareTo(fiches.get(j).getDate()) < 0) {
                    FicheDeSoins copy = fiches.get(j);
                    fiches.set(j, fiches.get(k));
                    fiches.set(k, copy);
                }
            }
        }
    }

    /*tri des fiches selon la date croissante*/
    public void trierDatesCroissantes() {
        for (int k = 0; k < fiches.size(); k++) {
            for (int j = k + 1; j < fiches.size(); j++) {
                if (fiches.get(k).getDate().compareTo(fiches.get(j).getDate()) > 0) {
                    FicheDeSoins copy = fiches.get(j);
                    fiches.set(j, fiches.get(k));
                    fiches.set(k, copy);
                }
            }
        }
    }

    /* Affichage des fiches de soins triées par patient */
    public String trierPatient(Patient p) {
        ArrayList<FicheDeSoins> copieFiches = new ArrayList<FicheDeSoins>(fiches);
        String s = "";

        while (!copieFiches.isEmpty()) {
            // on cherche les fiches avec le patient
            int i = 0;
            if (p.getNom().equals(copieFiches.get(i).getPatient().getNom())) {
                s += copieFiches.get(i).afficher();
            }
            i++;

            s += "------------------------" + "\n";
            //on la supprime de la liste :
            copieFiches.remove(copieFiches.get(i));
        }
        return s;
    }

    public ArrayList listeFichesParPatient(Patient p) {
        ArrayList<FicheDeSoins> listeFichesParPatient = new ArrayList<FicheDeSoins>();
        for (int i = 0; i < fiches.size(); i++) {
            if (fiches.get(i).getPatient().equals(p)) {
                listeFichesParPatient.add(fiches.get(i));
            }
        }
        return listeFichesParPatient;
    }

    /* tri des fiches par ordre alphbétique croissant des patients*/
    public void triFichesAlphabetiquePatientCroissant() {
        for (int k = 0; k < fiches.size(); k++) {
            for (int j = k + 1; j < fiches.size(); j++) {
                if (fiches.get(k).getPatient().getNom().compareTo(fiches.get(j).getPatient().getNom()) >= 0) {
                    FicheDeSoins copy = fiches.get(j);
                    fiches.set(j, fiches.get(k));
                    fiches.set(k, copy);
                }
            }
        }
    }

    /* tri des fiches par ordre alphbétique décroissant des patients*/
    public void triFichesAlphabetiquePatientDecroissant() {
        for (int k = 0; k < fiches.size(); k++) {
            for (int j = k + 1; j < fiches.size(); j++) {
                if (fiches.get(k).getPatient().getNom().compareTo(fiches.get(j).getPatient().getNom()) <= 0) {
                    FicheDeSoins copy = fiches.get(j);
                    fiches.set(j, fiches.get(k));
                    fiches.set(k, copy);
                }
            }
        }
    }

    public void triFichesAlphabetiqueMedecinCroissant() {
        for (int k = 0; k < fiches.size(); k++) {
            for (int j = k + 1; j < fiches.size(); j++) {
                if (fiches.get(k).getMedecin().getNom().compareTo(fiches.get(j).getMedecin().getNom()) >= 0) {
                    FicheDeSoins copy = fiches.get(j);
                    fiches.set(j, fiches.get(k));
                    fiches.set(k, copy);
                }
            }
        }
    }
    
    public void triFichesAlphabetiqueMedecinDeroissant() {
        for (int k = 0; k < fiches.size(); k++) {
            for (int j = k + 1; j < fiches.size(); j++) {
                if (fiches.get(k).getMedecin().getNom().compareTo(fiches.get(j).getMedecin().getNom()) <= 0) {
                    FicheDeSoins copy = fiches.get(j);
                    fiches.set(j, fiches.get(k));
                    fiches.set(k, copy);
                }
            }
        }
    }
    


    /* Affichage des fiches de soins triées par cout */
    public String trierCout() {
        ArrayList<FicheDeSoins> copieFiches = new ArrayList<FicheDeSoins>(fiches);
        String s = "";

        while (!copieFiches.isEmpty()) {
            // on cherche la fiche de soins de date minimale :
            int imin = 0;
            FicheDeSoins f1 = copieFiches.get(imin);
            for (int i = 1; i < copieFiches.size(); i++) {
                FicheDeSoins f2 = copieFiches.get(i);
                if (f2.coutTotal() < f1.coutTotal()) {
                    imin = i;
                    f1 = f2;
                }
            }
            // on affiche la fiche de soins trouvee :
            s += f1.afficher();
            s += "------------------------" + "\n";
            //on la supprime de la liste :
            copieFiches.remove(imin);
        }
        return s;
    }

    public void triCoutsOrdreCroissant() {
        for (int k = 0; k < fiches.size(); k++) {
            for (int j = k + 1; j < fiches.size(); j++) {
                if (fiches.get(k).coutTotal() > fiches.get(j).coutTotal()) {
                    FicheDeSoins copy = fiches.get(j);
                    fiches.set(j, fiches.get(k));
                    fiches.set(k, copy);
                }
            }
        }
    }

    public void triCoutsOrdreDeroissant() {
        for (int k = 0; k < fiches.size(); k++) {
            for (int j = k + 1; j < fiches.size(); j++) {
                if (fiches.get(k).coutTotal() < fiches.get(j).coutTotal()) {
                    FicheDeSoins copy = fiches.get(j);
                    fiches.set(j, fiches.get(k));
                    fiches.set(k, copy);
                }
            }
        }
    }

    // tri generique :
    public String trier(ComparaisonFiches c) {
        ArrayList<FicheDeSoins> copieFiches = new ArrayList<FicheDeSoins>(fiches);
        String s = "";

        while (!copieFiches.isEmpty()) {
            // on cherche la fiche de soins minimale :
            int imin = 0;
            FicheDeSoins f1 = copieFiches.get(imin);
            for (int i = 1; i < copieFiches.size(); i++) {
                FicheDeSoins f2 = copieFiches.get(i);
                if (c.comparer(f2, f1) < 0) {
                    imin = i;
                    f1 = f2;
                }
            }
            // on affiche la fiche de soins trouvee :
            s += f1.afficher();
            s += "------------------------" + "\n";
            //on la supprime de la liste :
            copieFiches.remove(imin);
        }
        return s;
    }

    /* Affichage les fiches de soins entre deux dates */
    public String afficherFichesDates(Date d1, Date d2, ComparaisonFiches c) {
        String s = "";
        ArrayList<FicheDeSoins> fichesParIntervalle = new ArrayList<FicheDeSoins>();
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            Date d = f.getDate();
            if (d.compareTo(d1) >= 0 && d.compareTo(d2) <= 0) {
                fichesParIntervalle.add(f);
            }
        }
        ArrayList<FicheDeSoins> copieFiches = new ArrayList<FicheDeSoins>(fichesParIntervalle);
        while (!copieFiches.isEmpty()) {
            // on cherche la fiche de soins minimale :
            int imin = 0;
            FicheDeSoins f1 = copieFiches.get(imin);
            for (int i = 1; i < copieFiches.size(); i++) {
                FicheDeSoins f2 = copieFiches.get(i);
                if (c.comparer(f2, f1) < 0) {
                    imin = i;
                    f1 = f2;
                }
            }
            // on affiche la fiche de soins trouvee :
            s += f1.toString() + " \n \n";
            //on la supprime de la liste :
            copieFiches.remove(imin);
        }
        return s;
    }

    public ArrayList listeFichesEntreDeuxDatesTriesOrdreCroissant(Date d1, Date d2) {
        ArrayList<FicheDeSoins> fichesEntreDeuxDates = new ArrayList<FicheDeSoins>();
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            Date d = f.getDate();
            if (d.compareTo(d1) >= 0 && d.compareTo(d2) <= 0) {
                fichesEntreDeuxDates.add(f);
            }
        }
        for (int k = 0; k < fichesEntreDeuxDates.size(); k++) {
            for (int j = k + 1; j < fichesEntreDeuxDates.size(); j++) {
                if (fiches.get(k).getDate().compareTo(fichesEntreDeuxDates.get(j).getDate()) < 0) {
                    FicheDeSoins copy = fichesEntreDeuxDates.get(j);
                    fichesEntreDeuxDates.set(j, fichesEntreDeuxDates.get(k));
                    fichesEntreDeuxDates.set(k, copy);
                }
            }
        }
        return fichesEntreDeuxDates;
    }

    public ArrayList listeFichesEntreDeuxDatesTriesOrdreDeroissant(Date d1, Date d2) {
        ArrayList<FicheDeSoins> fichesEntreDeuxDates = new ArrayList<FicheDeSoins>();
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            Date d = f.getDate();
            if (d.compareTo(d1) >= 0 && d.compareTo(d2) <= 0) {
                fichesEntreDeuxDates.add(f);
            }
        }
        for (int k = 0; k < fichesEntreDeuxDates.size(); k++) {
            for (int j = k + 1; j < fichesEntreDeuxDates.size(); j++) {
                if (fiches.get(k).getDate().compareTo(fichesEntreDeuxDates.get(j).getDate()) > 0) {
                    FicheDeSoins copy = fichesEntreDeuxDates.get(j);
                    fichesEntreDeuxDates.set(j, fichesEntreDeuxDates.get(k));
                    fichesEntreDeuxDates.set(k, copy);
                }
            }
        }
        return fichesEntreDeuxDates;
    }

    /* Affichage toutes les fiches avec les balises XML */
    public String toXML() {
        String s = "<dossiers>";
        for (int i = 0; i < fiches.size(); i++) {
            s += getFiche(i).toXML();
        }
        s += "</dossiers>";
        return s;
    }

}
