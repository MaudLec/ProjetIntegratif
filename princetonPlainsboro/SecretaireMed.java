package princetonPlainsboro;

public class SecretaireMed {

    private String nom;
    private String prenom;
    private String id;
    private String mdp;

    public SecretaireMed(String nom, String prenom, String id, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.mdp = mdp;
    }
            public SecretaireMed() {
        nom = "";
        prenom = "";
        id = "";
        mdp = "";
    }
            
                public String toString() { 
        return nom.toUpperCase() + " " + prenom; 
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getId() {
        return id;
    }

    public String getMdp() {
        return mdp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /* Création d'un médecin */
    public void creerMedecin(String nom, String prenom, Specialite spe, String tel, String mdp) {
        String id = "";
        Medecin med = new Medecin(nom, prenom, spe, tel, id, mdp);

    }

    /* Affichage des informations de la secrétaire médicale avec les valises XML  */
    public String toXML() {
        return ("<secretaireMed>" + "<nom>" + nom + "</nom>" + "<prenom>" + prenom + "</prenom>" + "<id>" + id + "</id> " + "<mdp>" + mdp + "</mdp>" + "</secretaireMed>");
    }
}
