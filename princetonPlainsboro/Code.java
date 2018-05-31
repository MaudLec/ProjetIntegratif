package princetonPlainsboro;

// Cette enumeration fait intervenir des valeurs qui possedent des
// attributs ('libelle' et 'cout') qui sont initialises par un appel du
// constructeur (arguments entre parentheses apres le nom de chaque valeur).
// Par exemple, la valeur Code.FP a un attribut 'libelle' contenant la chaine
// de caracteres "forfait pediatrique" et un attribut 'cout' ayant la valeur 5.0

enum Code {
     // valeurs de l'énum :
    C("Consultation au cabinet par le médecin généraliste, le chirurgien-dentiste omnipraticien ou la sage-femme", 25),
    CS("Consultation au cabinet par le médecin spécialiste qualifié, le médecin spécialiste qualifié en médecine générale ou le chirurgien–dentiste spécialiste qualifié", 23),
    APC("Avis ponctuel de consultant au cabinet (ou à domicile) pour les médecins de toutes spécialités (hors psychiatres, neuropsychiatres ou neurologues)", 48),
    APV("Avis ponctuel de consultant pour une visite au domicile du malade", 60),
    APY("Avis ponctuel de consultant pour une consultation au cabinet d'un psychiatre, neuropsychiatre ou d'un neurologue", 60),
    AVY("Avis ponctuel de consultant pour une visite au domicile du malade par un psychiatre, neuropsychiatre ou par un neurologue", 60),
    APU("Avis ponctuel de consultant des PROFESSEURS DES UNIVERSITÉS-PRATICIENS HOSPITALIERS (en activité)", 69),
    CCP("La première consultation de contraception et de prévention des maladies sexuellement transmissibles pour les jeunes filles de 15 à 18 ans", 46),
    U03("Consultation correspondant au niveau CCMU 3 du médecin urgentiste", 30),
    U45("Consultation correspondant au niveau CCMU 4 ou au niveau CCMU 5 du médecin urgentiste", 46),
    COE("Consultation obligatoire de l’enfant", 46),
    CSC("consultation pour les cardiologues", 47.73),
    CNPSY(" consultation pour les psychiatres, neuropsychiatres, neurologues", 39),
    CDE("consultation de dépistage du mélanome réalisée au cabinet par le médecin spécialiste en dermatologie", 46),
    V("Visite au domicile du malade par le médecin généraliste, le chirurgien-dentiste omnipraticien ou la sage-femme.", 23),
    VL("visite longue et complexe réalisée au domicile du patient atteint de maladie neurodégénérative par le médecin traitant", 60),
    VS("Vvisite à domicile par le médecin spécialiste et le médecin spécialiste qualifié en médecine générale (1)", 23),
    VNPSY("Vvisite à domicile pour les psychiatres, neuropsychiatres, neurologues", 39),
    K("Autres actes de spécialité", 2.52),
    KMB("Prélèvement par ponction veineuse directe réalisée par le médecin biologiste.", 2.52),
    Z("(seulement pour les stomatologistes)", 1.33),
    ORT("orthodontie", 2.15),
    TO("Traitements d'orthopédie dento-faciale pratiqués par le chirurgien-dentiste.", 2.15),
    SP("séance de suivi postnatal réalisé par la sage-femme.", 18.55),
    SF("Actes pratiqués par la sage-femme", 2.80),
    FI("Soins infirmiers pratiqués par la sage-femme", 2.18),
    AMS("Actes de rééducation des affections orthopédiques et rhumatologiques effectué par le masseur-kinésithérapeute", 2.15),
    AMK("Actes pratiqués par le masseur-kinésithérapeute au cabinet ou au domicile du malade, à l'exception des actes effectués dans un cabinet installé au sein d'un établissement d'hospitalisation privé au profit d'un malade hospitalisé.", 2.15),
    AMC("Actes pratiqués par le masseur-kinésithérapeute dans une structure de soins ou un établissement, y compris lorsque le malade y a élu domicile, autre que ceux qui donnent lieu à application de la lettre clé AMK", 2.15),
    AMI("Actes pratiqués par l’infirmier ou l'infirmière, à l'exception des actes infirmiers de soins qui donnent lieu à application de la lettre clé AIS.", 3.15),
    AIS("Actes infirmiers de soins. La lettre clé AIS est applicable aux séances de soins infirmiers et aux gardes au domicile des malades.", 2.65),
    DI("Démarche de soins infirmiers.", 10),
    AMP("Actes pratiqué par le pédicure", 0.63),
    POD("acte de prévention pratiqué par le pédicure-podologue", 27),
    AMO("Actes pratiqué par l'orthophoniste.", 2.50),
    AMY("Acte pratiqué par l’orthoptiste.", 2.50),
    VAC("Acte de vaccination pour le vaccin grippal pandémique A(H1N1) 2009, réalisé par un médecin au cours d’une séance de vaccination spécifique au cabinet ou au domicile du patient.", 29),
    FP("forfait pediatrique", 5.0),
    KC("actes de chirurgie et de specialite", 2.09),
    KE("actes d'echographie, de doppler", 1.89),
    KFA("forfait A", 30.49),
    KFB("forfait B", 60.98),
    PRO("prothese dentaire", 2.15);

                             
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
    }
