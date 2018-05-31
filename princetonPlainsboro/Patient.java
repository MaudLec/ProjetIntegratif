package princetonPlainsboro;

class Patient {
    private String nom;
    private String prenom;
    private NumSecu numSecu; 
    private String adresse; 
    private String naissance;
    private Sexe sexe;
    
    public Patient(String nom, String prenom, NumSecu numSecu, String adresse, String naissance, Sexe sexe) {
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


    public String getAdresse() {
        return adresse;
    }

    public NumSecu getNumSecu(){
        return numSecu;
    }
    public String getNaissance() {
        return naissance;
    }   
    
    public String toString() {
        String s = prenom + " " + nom + ", ";
        if (sexe == Sexe.F) {
            s += "femme";
        } else {
            s += "homme";
        }
        return s;
    }
    
    public boolean equals(Object o) {
        if (o instanceof Patient) {
            Patient p = (Patient)o;
            return getNom().equals(p.getNom()) && getPrenom().equals(p.getPrenom());
            }
        else
            return false;
        }    

  
    }

