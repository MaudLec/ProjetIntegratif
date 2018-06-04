package princetonPlainsboro;

public class Date implements Comparable {

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

    /* Affiche la date complète sous forme de String */
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
         s += annee;
        if (heure != 0 && minute != 0) {
            s += " à " + heure + "h";
            if (minute < 10) {
                s += "0" + minute;
            } else {
                s += minute;
            }
        }
        return s;
    }

    /* Affiche la date sous forme de String */
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

    /* Affiche la date pour le fichier XML */
    public String dateDeNaissancePourEcritureXML() {
        return jour + "-" + mois + "-" + annee;
    }

    /* Affiche la date complète pour le fichier XML  */
    public String datePourEcritureXML() {
        return annee + "-" + mois + "-" + jour + "/" + heure + ":" + minute;
    }

    /* Renvoie vraie si les dates sont égales, faux sinon */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour) && (heure == d.heure) && (minute == d.minute);
        } else {
            return false;
        }
    }

    /* Renvoie vraie si les dates sont égales, faux sinon */
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

    /* Comparaison de deux dates, +1 si plus grand, -1 si plus petit, 0 si égaux */
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

    /* Affichage du code avec les balises XML */
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
            s += "T";
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
