package princetonPlainsboro;

class Patient {
    private String nom;
    private String prenom;
    
    public Patient(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        }
    
    public String toString() {
        return prenom + " " + nom;
        }
    
    public boolean equals(Object o) {
        if (o instanceof Patient) {
            Patient p = (Patient)o;
            return nom.equals(p.nom) && prenom.equals(p.prenom);
            }
        else
            return false;
        }    
    }

