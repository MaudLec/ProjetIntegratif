package princetonPlainsboro;

class Medecin {

    private String nom;
    private String prenom;
    private String specialite;
    private int telephone;
    private int id;
    private int mdp;

    public Medecin(String nom, String prenom, String specialite, int telephone, int id, int mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.telephone = telephone;
        this.id = id;
        this.mdp = mdp;
    }

    public String getSpecialite() {
        return this.specialite;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getTelephone() {
        return telephone; //int could not be converted to string, so I had to create a string
    }

    public int getId() {
        return id;
    }

    public int getMdp() {
        return mdp;
    }

    public String toString() {
        return "Dr " + prenom + " " + nom + ", " + specialite;
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
