package princetonPlainsboro;

// Cette enumeration fait intervenir des valeurs qui possedent des
// attributs ('libelle' et 'cout') qui sont initialises par un appel du
// constructeur (arguments entre parentheses apres le nom de chaque valeur).
// Par exemple, la valeur Code.FP a un attribut 'libelle' contenant la chaine
// de caracteres "forfait pediatrique" et un attribut 'cout' ayant la valeur 5.0

public enum Code {
     // valeurs de l'énum :
       AIS("Actes infirmiers de soins. La lettre clé AIS est applicable aux séances de soins infirmiers et aux gardes au domicile des malades.", 2.65),
    AMC("Actes pratiqués par le masseur-kinésithérapeute dans une structure de soins ou un établissement, y compris lorsque le malade y a élu domicile, autre que ceux qui donnent lieu à application de la lettre clé AMK", 2.15),
    AMI("Actes pratiqués par l’infirmier ou l'infirmière, à l'exception des actes infirmiers de soins qui donnent lieu à application de la lettre clé AIS.", 3.15),
    AMK("Actes pratiqués par le masseur-kinésithérapeute au cabinet ou au domicile du malade, à l'exception des actes effectués dans un cabinet installé au sein d'un établissement d'hospitalisation privé au profit d'un malade hospitalisé.", 2.15),
    AMO("Actes pratiqué par l'orthophoniste.", 2.50),
    AMP("Actes pratiqué par le pédicure", 0.63),
    AMS("Actes de rééducation des affections orthopédiques et rhumatologiques effectué par le masseur-kinésithérapeute", 2.15),
    AMY("Acte pratiqué par l’orthoptiste.", 2.50),
    APC("Avis ponctuel de consultant au cabinet (ou à domicile) pour les médecins de toutes spécialités (hors psychiatres, neuropsychiatres ou neurologues)", 48),
    APU("Avis ponctuel de consultant des PROFESSEURS DES UNIVERSITÉS-PRATICIENS HOSPITALIERS (en activité)", 69),
    APV("Avis ponctuel de consultant pour une visite au domicile du malade", 60),
    APY("Avis ponctuel de consultant pour une consultation au cabinet d'un psychiatre, neuropsychiatre ou d'un neurologue", 60),
    AVY("Avis ponctuel de consultant pour une visite au domicile du malade par un psychiatre, neuropsychiatre ou par un neurologue", 60),
    C("Consultation au cabinet par le médecin généraliste, le chirurgien-dentiste omnipraticien ou la sage-femme", 25),
    CCP("La première consultation de contraception et de prévention des maladies sexuellement transmissibles pour les jeunes filles de 15 à 18 ans", 46),
    CDE("consultation de dépistage du mélanome réalisée au cabinet par le médecin spécialiste en dermatologie", 46),
    CNPSY(" consultation pour les psychiatres, neuropsychiatres, neurologues", 39),
    COE("Consultation obligatoire de l’enfant", 46),
    CS("Consultation au cabinet par le médecin spécialiste qualifié, le médecin spécialiste qualifié en médecine générale ou le chirurgien–dentiste spécialiste qualifié", 23),
    CSC("consultation pour les cardiologues", 47.73),
    DI("Démarche de soins infirmiers.", 10),
    FI("Soins infirmiers pratiqués par la sage-femme", 2.18),
    FP("forfait pediatrique", 5.0),
    K("Autres actes de spécialité", 2.52),
    KC("actes de chirurgie et de specialite", 2.09),
    KE("actes d'echographie, de doppler", 1.89),
    KFA("forfait A", 30.49),
    KFB("forfait B", 60.98),
    KMB("Prélèvement par ponction veineuse directe réalisée par le médecin biologiste.", 2.52),
    ORT("orthodontie", 2.15),
    POD("acte de prévention pratiqué par le pédicure-podologue", 27),
    PRO("prothese dentaire", 2.15),
    SF("Actes pratiqués par la sage-femme", 2.80),
    SP("séance de suivi postnatal réalisé par la sage-femme.", 18.55),
    TO("Traitements d'orthopédie dento-faciale pratiqués par le chirurgien-dentiste.", 2.15),
    U03("Consultation correspondant au niveau CCMU 3 du médecin urgentiste", 30),
    U45("Consultation correspondant au niveau CCMU 4 ou au niveau CCMU 5 du médecin urgentiste", 46),
    V("Visite au domicile du malade par le médecin généraliste, le chirurgien-dentiste omnipraticien ou la sage-femme.", 23),
    VAC("Acte de vaccination pour le vaccin grippal pandémique A(H1N1) 2009, réalisé par un médecin au cours d’une séance de vaccination spécifique au cabinet ou au domicile du patient.", 29),
    VL("visite longue et complexe réalisée au domicile du patient atteint de maladie neurodégénérative par le médecin traitant", 60),
    VNPSY("Vvisite à domicile pour les psychiatres, neuropsychiatres, neurologues", 39),
    VS("Vvisite à domicile par le médecin spécialiste et le médecin spécialiste qualifié en médecine générale (1)", 23),
    Z("(seulement pour les stomatologistes)", 1.33);


                             
    // attributs de l'énum :
    private String libelle;
    private double cout;
    
    // constructeur :
    private Code(String libelle, double cout) {
        this.libelle = libelle;
        this.cout = cout;
        }
    
    // méthodes :
    public String toString() {
        return super.toString() + " : " + libelle + ", cout=" + cout + " euros";
        }
    
    // calcule le prix pour un coefficient donne :
    public double calculerCout(int coefficient) {
        return coefficient * cout;
        }
     
    /* Affichage du code avec les balises XML */
    public String toXML(){
        return ("<code>" + this.name() + "</code>") ;
    }
     
      public static Code getCode(String code) {
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
     
    }
