package princetonPlainsboro;

class Date implements Comparable {
    private int jour;
    private int mois;
    private int annee;
    private int heure;
    private int minute;
        
        public Date(int jour, int mois, int annee, int heure, int minute) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.heure=heure;
        this.minute=minute;
        }
        
    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.heure=0;
        this.minute=0;
        }
    
    public String ecritureXML() {
        return jour+"-"+mois+"-"+annee;
    }
    
    public String afficherDate() {
        return jour+ "/" + mois+ "/" + annee;
    }
    
    public String toString() {
        return jour + "/" + mois + "/" + annee + ", " + heure + ":" + minute;
        }
    
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date)o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour);
            }
        else
            return false;
        }
    
    // precondition : 'o' est une instance de 'Date' :
    public int compareTo(Object o) {
        Date d = (Date)o;
        if (annee != d.annee)
            return annee - d.annee;
        // ici on a forcement annee == d.annee :
        if (mois != d.mois)
            return mois  - d.mois;
        // ici on a forcement annee == d.annee et mois == d.mois :
        return jour - d.jour;
        }
 public String toXML() {
        String s = "<date>" + annee;
        if (mois < 10) {
            s += "-0" + mois;
        } else {
            s += "-" + mois;
        }
        if (jour < 10) {
            s += "-0" + jour;
        } else {
            s += "-" + jour;
        }
        if (minute != 0 && heure != 0) {
            s+="T";
            if (heure < 10) {
                s += "0" + heure;
            } else {
                s += heure;
            }
             if (minute < 10) {
                s += ":0" + minute;
            } else {
                s += ":" + minute;
            }
        }
        s += "</date>";
        return s;
    }
    
    }
