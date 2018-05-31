package princetonPlainsboro;

class Medecin {

    private String nom;
    private String prenom;
    private Specialite specialite;
    private String telephone;
    private String id;
    private String mdp;

    public Medecin(String nom, String prenom, Specialite specialite, String telephone, String id, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.telephone = telephone;
        this.id = id;
        this.mdp = mdp;
    }

    public Specialite getSpecialite() {
        return this.specialite;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getTelephone() {
        return telephone; //int could not be converted to string, so I had to create a string
    }

    public String getId() {
        return id;
    }

    public String getMdp() {
        return mdp;
    }

    public String toString() {
        return "Dr " + prenom + " " + nom + ", " + specialite.toString();
    }

    public boolean equals(Object o) {
        if (o instanceof Medecin) {
            Medecin p = (Medecin) o;
            return this.getNom().equals(p.nom) && prenom.equals(p.prenom);
        } else {
            return false;
        }
    }
}
