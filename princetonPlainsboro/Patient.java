package princetonPlainsboro;

class Patient {

    private String nom;
    private String prenom;
    private NumSecu numSecu;
    private Adresse adresse;
    private Date naissance;
    private Sexe sexe;

    public Patient(String nom, String prenom, NumSecu numSecu, Adresse adresse, Date naissance, Sexe sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSecu = numSecu;
        this.adresse = adresse;
        this.naissance = naissance;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public NumSecu getNumSecu() {
        return numSecu;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumSecu(NumSecu numSecu) {
        this.numSecu = numSecu;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    /* Affichage du sexe avec le nom, prénom & numéro SS du patient */
    @Override
    public String toString() {
        String s = "";
        if (sexe == Sexe.F) {
            s += "Mme ";
        } else {
            if (sexe == Sexe.M) {
                s += "M.";
            }
        }

        s += nom.toUpperCase() + " " + prenom + " Numéro SS : " + numSecu.toString();
        return s;
    }

    /* Renvoie vraie ou faux si les deux patients sont les même ou non */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Patient) {
            Patient p = (Patient) o;
            return getNumSecu().equals(p.getNumSecu());
        } else {
            return false;
        }
    }

    /* Affichage des informations du patient avec les balises XML  */
    public String toXML() {
        return ("<patient>" + "<nom>" + nom + "</nom>" + "<prenom>" + prenom + "</prenom>" + numSecu.toXML() + adresse.toXML() + naissance.toXML() + sexe.toXML() + "</patient>");
    }

}
