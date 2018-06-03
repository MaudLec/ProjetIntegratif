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
        this.heure = heure;
        this.minute = minute;
    }

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.heure = 0;
        this.minute = 0;
    }


    public String toString() {
        String s = "";
        if (jour < 10) {
            s += "0" + jour + "/";
        } else {
            s += jour + "/";
        }
        if (mois < 10) {
            s += "0" + mois + "/";
        } else {
            s += mois + "/";
        }
        s += annee + " à " + heure + "h";
        if (minute < 10) {
            s += "0" + minute;
        } else {
            s += minute;
        }
        return s;
    }

    public String afficherDatedeNaissance() {
        if (mois < 10 && jour < 10) {
            return "0" + jour + " / 0" + mois + " / " + annee;
        }
        if (mois < 10) {
            return jour + " / 0" + mois + " / " + annee;
        }
        if (jour < 10) {
            return "0" + jour + " / " + mois + " / " + annee;
        } else {
            return +jour + " / " + mois + " / " + annee;
        }
    }

    public String dateDeNaissancePourEcritureXML() {
        return jour + "-" + mois + "-" + annee;
    }

    public String datePourEcritureXML() {
        return annee + "-" + mois + "-" + jour + "/" + heure + ":" + minute;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour) && (heure == d.heure) && (minute == d.minute);
        } else {
            return false;
        }
    }

    public boolean equalsDateDeNaissance(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour);
        } else {
            return false;
        }
    }
    
    // precondition : 'o' est une instance de 'Date' :
    @Override
    public int compareTo(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            if (annee != d.annee) {
                return annee - d.annee;
            }
            // ici on a forcement annee == d.annee :
            if (mois != d.mois) {
                return mois - d.mois;
            }
            // ici on a forcement annee == d.annee et mois == d.mois :
            if (jour != d.jour) {
                return jour - d.jour;
            }
            if (heure != d.heure) {
                return heure - d.heure;
            } else {
                return minute - d.minute;
            }
        } else {
            return 0;
        }
    }

    public int compareToTrie(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            if (annee != d.annee) {
                return annee - d.annee;
            }
            // ici on a forcement annee == d.annee :
            if (mois != d.mois) {
                return mois - d.mois;
            }
            // ici on a forcement annee == d.annee et mois == d.mois :
            if (jour != d.jour) {
                return jour - d.jour;
            }
        }
        return 0;

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
