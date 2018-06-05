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

    public ArrayList<FicheDeSoins> getFichesArchivees(){
        ArrayList<FicheDeSoins> fichesArchivees = null;
        String donneesCourantes = "";
        DossierMedical dossier = null;
        Date date = null;

        //personnes
        Medecin medecin = null;
        Patient patient = null;

        //infos des personnes
        String nom = "";
        String prenom = "";
        String id = "";
        String mdp = "";

        //infos medecin
        Specialite specialite = null;
        String numTel = "";

        //infos patient
        Sexe sexe = null;
        Date naissance = null;

        //infos de l'adresse patient
        Adresse adresse = null;
        String rue = "";
        String codePostal = "";
        String ville = "";

        //infos du Numero de Securite Sociale
        NumSecu numSecu = null;
        int sexeSecu = 0;
        int anneeSecu = 0;
        int moisSecu = 0;
        int dep = 0;
        int comm = 0;
        int reg = 0;
        int cle = 0;

        //infos acte
        ArrayList<Acte> actes = new ArrayList<Acte>();
        int coef = 0;
        TypeActe typeActe = null;
        Code code = null;
        String obs = "";

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
                        if (parser.getLocalName().equals("archives")) {
                            fichesArchivees = new ArrayList<>();
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        //lecture d une fiche de soins
                        if (parser.getLocalName().equals("ficheDeSoins")) {
                            FicheDeSoins f = new FicheDeSoins(patient, medecin, date);
                            // ajout des actes
                            for (int i = 0; i < actes.size(); i++) {
                                Acte a = (Acte) actes.get(i);
                                f.ajouterActe(a);
                            }
                            // effacer tous les actes de la liste
                            actes.clear();
                            // ajouter la fiche de soin au dossiers
                            fichesArchivees.add(f);
                        }

                        //lecture d une date --> il faudra la mettre à jour pour inclure les minutes
                        if (parser.getLocalName().equals("date")) {
                            int annee = Integer.parseInt(donneesCourantes.substring(0, donneesCourantes.indexOf('-')));
                            int mois = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf('-') + 1, donneesCourantes.lastIndexOf('-')));
                            int jour = Integer.parseInt(donneesCourantes.substring(donneesCourantes.lastIndexOf('-') + 1, donneesCourantes.length()));

                            date = new Date(jour, mois, annee);
                        }

                        //lecture des personnes
                        if (parser.getLocalName().equals("medecin")) {
                            medecin = new Medecin(nom, prenom, specialite, numTel, id, mdp);
                            dossier.ajouterMedecin(medecin);
                        }
                        if (parser.getLocalName().equals("patient")) {
                            patient = new Patient(nom, prenom, numSecu, adresse, naissance, sexe);
                            dossier.ajouterPatient(patient);
                        }

                        //lecture des infos des personnes
                        if (parser.getLocalName().equals("nom")) {
                            nom = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("prenom")) {
                            prenom = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("id")) {
                            id = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("mdp")) {
                            mdp = donneesCourantes;
                        }

                        //lecture des infos medecin
                        if (parser.getLocalName().equals("numtel")) {
                            numTel = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("specialite")) {
                            specialite = getSpecialite(donneesCourantes);
                            if (specialite == null) {
                                throw new XMLStreamException("Impossible de trouver la specialite : " + donneesCourantes);
                            }
                        }

                        //lecture des infos patients
                        if (parser.getLocalName().equals("sexe")) {
                            sexe = getSexe(donneesCourantes);
                            if (sexe == null) {
                                throw new XMLStreamException("Impossible de trouver le sexe :" + donneesCourantes);
                            }
                        }
                        if (parser.getLocalName().equals("naissance")) {
                            int annee = Integer.parseInt(donneesCourantes.substring(0, donneesCourantes.indexOf('-')));
                            int mois = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf('-') + 1, donneesCourantes.lastIndexOf('-')));
                            int jour = Integer.parseInt(donneesCourantes.substring(donneesCourantes.lastIndexOf('-') + 1, donneesCourantes.length()));

                            naissance = new Date(jour, mois, annee);
                        }

                        //lecture des infos de l adresse patient
                        if (parser.getLocalName().equals("adresse")) {
                            adresse = new Adresse(rue, codePostal, ville);
                        }
                        if (parser.getLocalName().equals("rue")) {
                            rue = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("codepostal")) {
                            codePostal = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("ville")) {
                            ville = donneesCourantes;
                        }

                        //lecture des infos numero de secu .
                        if (parser.getLocalName().equals("numsecu")) {
                            numSecu = new NumSecu(sexeSecu, anneeSecu, moisSecu, dep, comm, reg, cle);
                        }
                        if (parser.getLocalName().equals("sexesecu")) {
                            sexeSecu = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("annee")) {
                            anneeSecu = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("mois")) {
                            moisSecu = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("dep")) {
                            dep = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("comm")) {
                            comm = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("reg")) {
                            reg = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("cle")) {
                            cle = Integer.parseInt(donneesCourantes);
                        }

                        //Lecture d un acte
                        if (parser.getLocalName().equals("acte")) {
                            actes.add(new Acte(code, coef, typeActe, obs));
                        }
                        if (parser.getLocalName().equals("code")) {
                            code = getCode(donneesCourantes);
                            if (code == null) {
                                throw new XMLStreamException("Impossible de trouver le code d'acte = " + donneesCourantes);
                            }
                        }
                        if (parser.getLocalName().equals("coef")) {
                            coef = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("type")) {
                            typeActe = getType(donneesCourantes);
                            if (typeActe == null) {
                                throw new XMLStreamException("Impossible de trouver le type d'acte = " + donneesCourantes);
                            }
                        }
                        if (parser.getLocalName().equals("observation")) {
                            obs = donneesCourantes;
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

        return fichesArchivees;
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
                        if (parser.getLocalName().equals("dossiers")) {
                            listeIdentificationCourante = new ListeIdentification();
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        //-----------identification--------------------
                        if (parser.getLocalName().equals("id")) {
                            identifiantCourant = donneesCourantes;
                            listeIdentificationCourante.getListeId().add(identifiantCourant);
                        }
                        if (parser.getLocalName().equals("mdp")) {
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

    public DossierMedical getDossier() {
        String donneesCourantes = "";
        DossierMedical dossier = null;
        Date date = null;

        //personnes
        Medecin medecin = null;
        Patient patient = null;
        SecretaireMed secretaireMed = null;
        SecretaireAdmin secretaireAdmin = null;

        //infos des personnes
        String nom = "";
        String prenom = "";
        String id = "";
        String mdp = "";

        //infos medecin
        Specialite specialite = null;
        String numTel = "";

        //infos patient
        Sexe sexe = null;
        Date naissance = null;

        //infos de l'adresse patient
        Adresse adresse = null;
        String rue = "";
        String codePostal = "";
        String ville = "";

        //infos du Numero de Securite Sociale
        NumSecu numSecu = null;
        int sexeSecu = 0;
        int anneeSecu = 0;
        int moisSecu = 0;
        int dep = 0;
        int comm = 0;
        int reg = 0;
        int cle = 0;

        //infos acte
        ArrayList<Acte> actes = new ArrayList<Acte>();
        int coef = 0;
        TypeActe typeActe = null;
        Code code = null;
        String obs = "";

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
                            dossier = new DossierMedical();
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        //lecture d une fiche de soins
                        if (parser.getLocalName().equals("ficheDeSoins")) {
                            FicheDeSoins f = new FicheDeSoins(patient, medecin, date);
                            // ajout des actes
                            for (int i = 0; i < actes.size(); i++) {
                                Acte a = (Acte) actes.get(i);
                                f.ajouterActe(a);
                            }
                            // effacer tous les actes de la liste
                            actes.clear();
                            // ajouter la fiche de soin au dossiers
                            dossier.ajouterFiche(f);
                        }

                        //lecture d une date --> il faudra la mettre à jour pour inclure les minutes
                        if (parser.getLocalName().equals("date")) {
                            int annee = Integer.parseInt(donneesCourantes.substring(0, donneesCourantes.indexOf('-')));
                            int mois = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf('-') + 1, donneesCourantes.lastIndexOf('-')));
                            int jour = Integer.parseInt(donneesCourantes.substring(donneesCourantes.lastIndexOf('-') + 1, donneesCourantes.length()));

                            date = new Date(jour, mois, annee);
                        }

                        //lecture des personnes
                        if (parser.getLocalName().equals("medecin")) {
                            medecin = new Medecin(nom, prenom, specialite, numTel, id, mdp);
                            dossier.ajouterMedecin(medecin);
                        }
                        if (parser.getLocalName().equals("patient")) {
                            patient = new Patient(nom, prenom, numSecu, adresse, naissance, sexe);
                            dossier.ajouterPatient(patient);
                        }
                        if (parser.getLocalName().equals("secretairemed")) {
                            secretaireMed = new SecretaireMed(nom, prenom, id, mdp);
                        }
                        if (parser.getLocalName().equals("secretaireadmin")) {
                            secretaireAdmin = new SecretaireAdmin(nom, prenom, id, mdp);
                        }

                        //lecture des infos des personnes
                        if (parser.getLocalName().equals("nom")) {
                            nom = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("prenom")) {
                            prenom = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("id")) {
                            id = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("mdp")) {
                            mdp = donneesCourantes;
                        }

                        //lecture des infos medecin
                        if (parser.getLocalName().equals("numtel")) {
                            numTel = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("specialite")) {
                            specialite = getSpecialite(donneesCourantes);
                            if (specialite == null) {
                                throw new XMLStreamException("Impossible de trouver la specialite : " + donneesCourantes);
                            }
                        }

                        //lecture des infos patients
                        if (parser.getLocalName().equals("sexe")) {
                            sexe = getSexe(donneesCourantes);
                            if (sexe == null) {
                                throw new XMLStreamException("Impossible de trouver le sexe :" + donneesCourantes);
                            }
                        }
                        if (parser.getLocalName().equals("naissance")) {
                            int annee = Integer.parseInt(donneesCourantes.substring(0, donneesCourantes.indexOf('-')));
                            int mois = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf('-') + 1, donneesCourantes.lastIndexOf('-')));
                            int jour = Integer.parseInt(donneesCourantes.substring(donneesCourantes.lastIndexOf('-') + 1, donneesCourantes.length()));

                            naissance = new Date(jour, mois, annee);
                        }

                        //lecture des infos de l adresse patient
                        if (parser.getLocalName().equals("adresse")) {
                            adresse = new Adresse(rue, codePostal, ville);
                        }
                        if (parser.getLocalName().equals("rue")) {
                            rue = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("codepostal")) {
                            codePostal = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("ville")) {
                            ville = donneesCourantes;
                        }

                        //lecture des infos numero de secu .
                        if (parser.getLocalName().equals("numsecu")) {
                            numSecu = new NumSecu(sexeSecu, anneeSecu, moisSecu, dep, comm, reg, cle);
                        }
                        if (parser.getLocalName().equals("sexesecu")) {
                            sexeSecu = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("annee")) {
                            anneeSecu = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("mois")) {
                            moisSecu = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("dep")) {
                            dep = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("comm")) {
                            comm = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("reg")) {
                            reg = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("cle")) {
                            cle = Integer.parseInt(donneesCourantes);
                        }

                        //Lecture d un acte
                        if (parser.getLocalName().equals("acte")) {
                            actes.add(new Acte(code, coef, typeActe, obs));
                        }
                        if (parser.getLocalName().equals("code")) {
                            code = getCode(donneesCourantes);
                            if (code == null) {
                                throw new XMLStreamException("Impossible de trouver le code d'acte = " + donneesCourantes);
                            }
                        }
                        if (parser.getLocalName().equals("coef")) {
                            coef = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("type")) {
                            typeActe = getType(donneesCourantes);
                            if (typeActe == null) {
                                throw new XMLStreamException("Impossible de trouver le type d'acte = " + donneesCourantes);
                            }
                        }
                        if (parser.getLocalName().equals("observation")) {
                            obs = donneesCourantes;
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

        return dossier;
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
        if (type.equals("Teerapeutique")) {
            return TypeActe.therapeutique;
        }
        if (type.equals("Diagnostique")) {
            return TypeActe.diagnostique;
        }
        return null;
    }

    private static Sexe getSexe(String sexe) {
        if (sexe.equals("M")) {
            return Sexe.M;
        }
        if (sexe.equals("F")) {
            return Sexe.F;
        }
        if (sexe.equals("Autre")) {
            return Sexe.Autre;
        }
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
