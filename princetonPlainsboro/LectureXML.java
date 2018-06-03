/*
 * LectureXML.java
 *
 * Created on 5 janvier 2006, 18:26
 *
 * Lecture d'un document XML et transformation en instances Java
 */
package princetonPlainsboro;

import java.io.*;
import java.util.ArrayList;
import javax.xml.stream.*;

/**
 * Lecture d'un document XML et transformation en instances Java.
 *
 *
 */
public class LectureXML {

    /// nom du document XML a analyser
    private String nomFichier;
    private final static String repBase = "src/donnees/";

    // 'nomFichier' est le nom d'un fichier XML se trouvant dans le repertoire 'repBase' a lire :
    public LectureXML(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public ListeIdentification getListeIdentification() {
        //-------mot de passe---------------
        ListeIdentification listeIdentificationCourante = null;
        String identifiantCourant = "";
        String motDePasseCourant = "";
        String donneesCourantes = "";

        //--------------------------------
        try {
            // instanciation du parser
            InputStream in = new FileInputStream(repBase + nomFichier);
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader parser = factory.createXMLStreamReader(in);
            // lecture des evenements
            for (int event = parser.next(); event != XMLStreamConstants.END_DOCUMENT; event = parser.next()) {
                // traitement selon l'evenement
                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        if (parser.getLocalName().equals("identification")) {
                            listeIdentificationCourante = new ListeIdentification();
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        //-----------identification--------------------
                        if (parser.getLocalName().equals("identifiant")) {
                            identifiantCourant = donneesCourantes;
                            listeIdentificationCourante.getListeId().add(identifiantCourant);
                        }
                        if (parser.getLocalName().equals("motdepasse")) {
                            motDePasseCourant = donneesCourantes;
                            listeIdentificationCourante.getListeMdp().add(motDePasseCourant);
                        }


                        //---------------------------------------------
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        donneesCourantes = parser.getText();
                        break;
                } // end switch
            } // end while
            parser.close();
        } catch (XMLStreamException ex) {
            System.out.println("Exception de type 'XMLStreamException' lors de la lecture du fichier : " + nomFichier);
            System.out.println("Details :");
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println("Exception de type 'IOException' lors de la lecture du fichier : " + nomFichier);
            System.out.println("Verifier le chemin.");
            System.out.println(ex.getMessage());
        }
        return listeIdentificationCourante;
    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public DossierMedical getDossier() {
        DossierMedical dossierCourant = null;
        Date date = null;
        Medecin medecinCourant = null;
        Patient patientCourant = null;
        ArrayList<Acte> actes = new ArrayList<Acte>();
        String donneesCourantes = "";
        String nomCourant = "";
        String prenomCourant = "";
        String idCourant = "";
        String mdpCourant = "";
        Adresse adresseCourante = null;
        String rue = "";
        String codepostal = "";
        String ville = "";
        String telephoneCourant = "";
        Date dateDeNaissanceCourante = null;
        NumSecu numSecuCourant = null;
        TypeActe typeCourant = null;
        int anneeCourante = 0;
        int moisCourant = 0;
        int departementNaissanceCourant = 0;
        int numCommuneCourant = 0;
        int ordreRegistreNaissanceCourant = 0;
        int cleCourante = 0;
        Specialite specialiteCourante = null;
        Code codeCourant = null;
        int coefCourant = 0;
        String observationCourante = "";
        Sexe sexeCourant = null;
        

        // analyser le fichier par StAX
        try {
            // instanciation du parser
            InputStream in = new FileInputStream(repBase + nomFichier);
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader parser = factory.createXMLStreamReader(in);

            // lecture des evenements
            for (int event = parser.next(); event != XMLStreamConstants.END_DOCUMENT; event = parser.next()) {
                // traitement selon l'evenement
                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        if (parser.getLocalName().equals("dossiers")) {
                            dossierCourant = new DossierMedical();
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        if (parser.getLocalName().equals("acte")) {
                            actes.add(new Acte(codeCourant, coefCourant, typeCourant, observationCourante));
                        }
                        if (parser.getLocalName().equals("code")) {
                            codeCourant = getCode(donneesCourantes);
                            if (codeCourant == null) {
                                throw new XMLStreamException("Impossible de trouver le code d'acte = " + donneesCourantes);
                            }
                        }

                        if (parser.getLocalName().equals("coef")) {
                            coefCourant = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("date")) {
                            int annee = Integer.parseInt(donneesCourantes.substring(0, donneesCourantes.indexOf('-')));
                            int mois = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf('-') + 1, donneesCourantes.lastIndexOf('-')));
                            int jour = Integer.parseInt(donneesCourantes.substring(donneesCourantes.lastIndexOf('-') + 1, donneesCourantes.indexOf('_')));

                            int heure = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf('_') + 1, donneesCourantes.indexOf(':')));
                            int minute = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf(':') + 1, donneesCourantes.length()));
                            date = new Date(jour, mois, annee, heure, minute);
                        }
                        if (parser.getLocalName().equals("ficheDeSoins")) {
                            FicheDeSoins f = new FicheDeSoins(patientCourant, medecinCourant, date);
                            // ajout des actes
                            for (int i = 0; i < actes.size(); i++) {
                                Acte a = (Acte) actes.get(i);
                                f.ajouterActe(a);
                            }
                            // effacer tous les actes de la liste
                            actes.clear();
                            // ajouter la fiche de soin au dossiers
                            dossierCourant.ajouterFiche(f);
                        }
                        if (parser.getLocalName().equals("medecin")) {
                            medecinCourant = new Medecin(nomCourant, prenomCourant, specialiteCourante, telephoneCourant, idCourant, mdpCourant);
                            int i = 0;
                            while (i < dossierCourant.getMedecins().size() && !(dossierCourant.getMedecins().get(i).getId().equals(idCourant))) {
                                i++;
                            }
                            if (i == dossierCourant.getMedecins().size()) {
                                dossierCourant.getMedecins().add(medecinCourant);
                            } else {
                                medecinCourant = dossierCourant.getMedecins().get(i);
                            }
                        }
                        if (parser.getLocalName().equals("nom")) {
                            nomCourant = donneesCourantes;
                        }
                        //--------------------------------------------------------------------
                        if (parser.getLocalName().equals("adresse")) {
                            adresseCourante = new Adresse(rue, codepostal, ville);
                        }
                        //---------------------------------------------------------------------
                        if (parser.getLocalName().equals("patient")) {
                            patientCourant = new Patient(nomCourant, prenomCourant, numSecuCourant, adresseCourante, dateDeNaissanceCourante, sexeCourant);
                            int i = 0;
                            while (i < dossierCourant.getPatients().size() && !(dossierCourant.getPatients().get(i).getNumSecu().equals(numSecuCourant))) {
                                i++;
                            }
                            if (i == dossierCourant.getPatients().size()) {
                                dossierCourant.getPatients().add(patientCourant);
                            } else {
                                patientCourant = dossierCourant.getPatients().get(i);
                            }
                        }

                        if (parser.getLocalName().equals("prenom")) {
                            prenomCourant = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("specialite")) {
                            specialiteCourante = getSpecialite(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("id")) {
                            idCourant = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("telephone")) {
                            telephoneCourant = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("dateDeNaissance")) {

                            int jour = Integer.parseInt(donneesCourantes.substring(0, donneesCourantes.indexOf('-')));
                            int mois = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf('-') + 1, donneesCourantes.lastIndexOf('-')));
                            int annee = Integer.parseInt(donneesCourantes.substring(donneesCourantes.lastIndexOf('-') + 1, donneesCourantes.length()));
                            dateDeNaissanceCourante = new Date(jour, mois, annee);
                        }
                        if (parser.getLocalName().equals("sexe")) {
                            sexeCourant = getSexe(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("annee")) {
                            anneeCourante = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("mois")) {
                            moisCourant = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("departementNaissance")) {
                            departementNaissanceCourant = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("numCommune")) {
                            numCommuneCourant = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("ordreRegistreNaissance")) {
                            ordreRegistreNaissanceCourant = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("cle")) {
                            cleCourante = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("numSecu")) {
                            numSecuCourant = new NumSecu(sexeCourant.ordinal(), anneeCourante, moisCourant,
                                    departementNaissanceCourant, numCommuneCourant, ordreRegistreNaissanceCourant, cleCourante);
                        }
                        if (parser.getLocalName().equals("type")) {
                            typeCourant = getType(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("observationMed")) {
                            observationCourante = donneesCourantes;
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        donneesCourantes = parser.getText();
                        break;
                } // end switch
            } // end while
            parser.close();
        } catch (XMLStreamException ex) {
            System.out.println("Exception de type 'XMLStreamException' lors de la lecture du fichier : " + nomFichier);
            System.out.println("Details :");
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println("Exception de type 'IOException' lors de la lecture du fichier : " + nomFichier);
            System.out.println("Verifier le chemin.");
            System.out.println(ex.getMessage());
        }

        return dossierCourant;
    }
    
    private static Code getCode(String code) {
        if (code.equals("C")) {
            return Code.C;
        }
        if (code.equals("CS")) {
            return Code.CS;
        }
        if (code.equals("CSC")) {
            return Code.CSC;
        }
        if (code.equals("APC")) {
            return Code.APC;
        }
        if (code.equals("APV")) {
            return Code.APV;
        }
        if (code.equals("APY")) {
            return Code.APY;
        }
        if (code.equals("AVY")) {
            return Code.AVY;
        }
        if (code.equals("APU")) {
            return Code.APU;
        }
        if (code.equals("CCP")) {
            return Code.CCP;
        }
        if (code.equals("U03")) {
            return Code.U03;
        }
        if (code.equals("U45")) {
            return Code.U45;
        }
        if (code.equals("COE")) {
            return Code.COE;
        }
        if (code.equals("CNPSY")) {
            return Code.CNPSY;
        }
        if (code.equals("CDE")) {
            return Code.CDE;
        }
        if (code.equals("V")) {
            return Code.V;
        }
        if (code.equals("VL")) {
            return Code.VL;
        }
        if (code.equals("VS")) {
            return Code.VS;
        }
        if (code.equals("VNPSY")) {
            return Code.VNPSY;
        }
        if (code.equals("K")) {
            return Code.K;
        }
        if (code.equals("KMB")) {
            return Code.KMB;
        }
        if (code.equals("Z")) {
            return Code.Z;
        }
        if (code.equals("ORT")) {
            return Code.ORT;
        }
        if (code.equals("TO")) {
            return Code.TO;
        }
        if (code.equals("SP")) {
            return Code.SP;
        }
        if (code.equals("SF")) {
            return Code.SF;
        }
        if (code.equals("FI")) {
            return Code.FI;
        }
        if (code.equals("AMS")) {
            return Code.AMS;
        }
        if (code.equals("AMK")) {
            return Code.AMK;
        }
        if (code.equals("AMC")) {
            return Code.AMC;
        }
        if (code.equals("AMI")) {
            return Code.AMI;
        }
        if (code.equals("AIS")) {
            return Code.AIS;
        }
        if (code.equals("DI")) {
            return Code.DI;
        }
        if (code.equals("AMP")) {
            return Code.AMP;
        }
        if (code.equals("POD")) {
            return Code.POD;
        }
        if (code.equals("AMO")) {
            return Code.AMO;
        }
        if (code.equals("AMY")) {
            return Code.AMY;
        }
        if (code.equals("VAC")) {
            return Code.VAC;
        }
        if (code.equals("FP")) {
            return Code.FP;
        }
        if (code.equals("KC")) {
            return Code.KC;
        }
        if (code.equals("KE")) {
            return Code.KE;
        }
        if (code.equals("KFA")) {
            return Code.KFA;
        }
        if (code.equals("KFB")) {
            return Code.KFB;
        }
        if (code.equals("PRO")) {
            return Code.PRO;
        }
        return null;
    }

    private static TypeActe getType(String type) {
        if (type.equals("therapeutique")) {
            return TypeActe.therapeutique;
        }
        if (type.equals("diagnostique")) {
            return TypeActe.diagnostique;
        }
        return null;
    }
    
    private static Sexe getSexe(String sexe) {
        if (sexe.equals("F")) { return Sexe.F; }
        if (sexe.equals("M")) { return Sexe.M; }
        if (sexe.equals("Autre")) { return Sexe.Autre; }
        return null;
    }

    private static Specialite getSpecialite(String specialite) {
        if (specialite.equals("autre")) {
            return Specialite.Autre;
        }
        if (specialite.equals("Anatomopathologie")) {
            return Specialite.Anatomopathologie;
        }
        if (specialite.equals("Anesthesiologie")) {
            return Specialite.Anesthésiologie;
        }
        if (specialite.equals("Bactériologie")) {
            return Specialite.Bactériologie;
        }
        if (specialite.equals("Biochimie")) {
            return Specialite.Biochimie;
        }
        if (specialite.equals("Cardiologie")) {
            return Specialite.Cardiologie;
        }
        if (specialite.equals("Chirurgie")) {
            return Specialite.Chirurgie;
        }
        if (specialite.equals("Cytogénétique")) {
            return Specialite.Cytogénétique;
        }
        if (specialite.equals("Dermatologie")) {
            return Specialite.Dermatologie;
        }
        if (specialite.equals("Endocrinologie")) {
            return Specialite.Endocrinologie;
        }
        if (specialite.equals("Généraliste")) {
            return Specialite.Généraliste;
        }
        if (specialite.equals("Gérontologie")) {
            return Specialite.Gérontologie;
        }
        if (specialite.equals("Gynécologie")) {
            return Specialite.Gynécologie;
        }
        if (specialite.equals("Hématologie")) {
            return Specialite.Hématologie;
        }
        if (specialite.equals("Hémodialyse")) {
            return Specialite.Hémodialyse;
        }
        if (specialite.equals("Hépatogastroentérologie")) {
            return Specialite.Hépatogastroentérologie;
        }
        if (specialite.equals("Immunologie")) {
            return Specialite.Immunologie;
        }
        if (specialite.equals("Mycologie")) {
            return Specialite.Mycologie;
        }
        if (specialite.equals("Néonatologie")) {
            return Specialite.Néonatologie;
        }
        if (specialite.equals("Néphrologie")) {
            return Specialite.Néphrologie;
        }
        if (specialite.equals("Neurochirurgie")) {
            return Specialite.Neurochirurgie;
        }
        if (specialite.equals("Neurologie")) {
            return Specialite.Neurologie;
        }
        if (specialite.equals("Nutrition")) {
            return Specialite.Nutrition;
        }
        if (specialite.equals("Odontologie")) {
            return Specialite.Odontologie;
        }
        if (specialite.equals("Oncologie")) {
            return Specialite.Oncologie;
        }
        if (specialite.equals("Ophtalmologie")) {
            return Specialite.Ophtalmologie;
        }
        if (specialite.equals("ORL")) {
            return Specialite.ORL;
        }
        if (specialite.equals("Orthopédie")) {
            return Specialite.Orthopédie;
        }
        if (specialite.equals("Pédiatrie")) {
            return Specialite.Pédiatrie;
        }
        if (specialite.equals("Pédopsychiatrie")) {
            return Specialite.Pédopsychiatrie;
        }
        if (specialite.equals("Pharmacologie")) {
            return Specialite.Pharmacologie;
        }
        if (specialite.equals("Pneumologie")) {
            return Specialite.Pneumologie;
        }
        if (specialite.equals("Psychiatrie")) {
            return Specialite.Psychiatrie;
        }
        if (specialite.equals("Radiologie")) {
            return Specialite.Radiologie;
        }
        if (specialite.equals("Réanimation")) {
            return Specialite.Réanimation;
        }
        if (specialite.equals("Rhumatologie")) {
            return Specialite.Rhumatologie;
        }
        if (specialite.equals("Sport")) {
            return Specialite.Sport;
        }
        if (specialite.equals("Toxicologie")) {
            return Specialite.Toxicologie;
        }
        if (specialite.equals("Traumatologie")) {
            return Specialite.Traumatologie;
        }
        if (specialite.equals("Urologie")) {
            return Specialite.Urologie;
        }
        if (specialite.equals("Virologie")) {
            return Specialite.Virologie;
        }
        return null;

    }

}
