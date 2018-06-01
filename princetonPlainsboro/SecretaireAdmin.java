package princetonPlainsboro;

public class SecretaireAdmin {

    private String nom;
    private String prenom;
    private String id;
    private String mdp;

    public SecretaireAdmin(String nom, String prenom, String id, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.mdp = mdp;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public static String generate(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuffer pass = new StringBuffer();
        for (int x = 0; x < length; x++) {
            int i = (int) Math.floor(Math.random() * (chars.length() - 1));
            pass.append(chars.charAt(i));
        }
        return pass.toString();
    }

    public void creerMedecin(String nom, String prenom, Specialite spe, String tel) {
        String id = "1"+this.generate(10);
        String mdp = this.generate(8);
        Medecin med = new Medecin(nom, prenom, spe, tel, id, mdp);
    }

        public void creerSecretaireMed(String nom, String prenom) {
        String id = "2"+this.generate(10);
        String mdp = this.generate(8);
        SecretaireMed med = new SecretaireMed(nom, prenom, id, mdp);
    }
            public void creerSecretaireAdmin(String nom, String prenom) {
        String id = "3"+this.generate(10);
        String mdp = this.generate(8);
        SecretaireAdmin med = new SecretaireAdmin(nom, prenom, id, mdp);
    }
            
}
