package princetonPlainsboro;

public class Test {

    public static void main(String[] args) {
        LectureXML test = new LectureXML("dossiers.xml");
        DossierMedical dm = test.getDossier();
        dm.afficherToutesFiches();



        System.out.println("\n********\n");

        Adresse adr = new Adresse ("fecun", "vjij", "juvih");
        NumSecu ns = new NumSecu (1,49,8,45,695,205,45);
        Sexe sexe = Sexe.F;
        Date date = new Date(10,05,1996);
        Patient p1 = new Patient("Bole", "Pat",ns, adr, date, sexe);
        System.out.println("> cout de : " + "\n   " + p1.toString() + "\n    = " + dm.coutPatient(p1) + "€");

        System.out.println("\n********\n");

        String spe = "Cardiologue";
        System.out.println("> cout de la specialite '" + spe + "' = " + dm.coutSpecialite(spe) + "€");

        System.out.println("\n********\n");

        Medecin m1 = new Medecin("Deblouze", "Agathe", Specialite.Cardiologie, "05384", "veu", "vnu");
        dm.afficherListePatients(m1);

        System.out.println("\n********\n");

        Date d1 = new Date(01, 11, 2005);        Date d2 = new Date(05, 01, 2006);
        System.out.println("> nombre de fiches entre : " + "\n   " + d1 + "\n   et " + "\n   "+ d2 + "\n     = " + dm.nombreFichesIntervalle(d1, d2));

        System.out.println("\n********\n");

        System.out.println("\n********\n");

        System.out.println();
        System.out.println("Dossier trie selon les dates :");
        dm.trierDates();

        System.out.println("\n********\n");

        System.out.println();
        System.out.println("Dossier trie selon les couts :");
        dm.trier(new ComparaisonFichesCouts());
        
        
        //// pour tester l'écriture en XML, commenter tout ce qu'il y a au-dessus et décommenter les lignes suivantes:  
//        LectureXML test = new LectureXML("dossiers.xml");
//        DossierMedical dm = test.getDossier();
//        EcritureXML e1 = new EcritureXML(dm, "medecins.xml");
//        e1.editerMedecins();
//        EcritureXML e2 = new EcritureXML(dm, "patients.xml");
//        e2.editerPatients();
//        EcritureXML e3 = new EcritureXML(dm, "dossiersoverride.xml");
//        e3.editerDossier();
    }
}
