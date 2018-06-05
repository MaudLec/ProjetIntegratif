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
    
    public Date(String s) {
        int[] tab = new int[3];
        tab[0] = s.charAt(0)*10 + s.charAt(1);
        tab[1] = s.charAt(2)*10 + s.charAt(3);
        tab[2] = s.charAt(4)*1000 + s.charAt(5)*100 + s.charAt(6)*10 + s.charAt(7);

        this.jour = tab[0];
        this.mois = tab[1];
        this.annee = tab[2];

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
        if (getJour() < 10) {
            s += "0" + getJour() + "/";
        } else {
            s += getJour() + "/";
        }
        if (getMois() < 10) {
            s += "0" + getMois() + "/";
        } else {
            s += getMois() + "/";
        }
         s += getAnnee();
        if (getHeure() != 0 && getMinute() != 0) {
            s += " à " + getHeure() + "h";
            if (getMinute() < 10) {
                s += "0" + getMinute();
            } else {
                s += getMinute();
            }
        }
        return s;
    }

    /* Affiche la date sous forme de String */
    public String afficherDatedeNaissance() {
        if (getMois() < 10 && getJour() < 10) {
            return "0" + getJour() + " / 0" + getMois() + " / " + getAnnee();
        }
        if (getMois() < 10) {
            return getJour() + " / 0" + getMois() + " / " + getAnnee();
        }
        if (getJour() < 10) {
            return "0" + getJour() + " / " + getMois() + " / " + getAnnee();
        } else {
            return +getJour() + " / " + getMois() + " / " + getAnnee();
        }
    }

    /* Affiche la date pour le fichier XML */
    public String dateDeNaissancePourEcritureXML() {
        return getJour() + "-" + getMois() + "-" + getAnnee();
    }

    /* Affiche la date complète pour le fichier XML  */
    public String datePourEcritureXML() {
        return getAnnee() + "-" + getMois() + "-" + getJour() + "/" + getHeure() + ":" + getMinute();
    }

    /* Renvoie vraie si les dates sont égales, faux sinon */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            return (getAnnee() == d.getAnnee()) && (getMois() == d.getMois()) && (getJour() == d.getJour()) && (getHeure() == d.getHeure()) && (getMinute() == d.getMinute());
        } else {
            return false;
        }
    }

    /* Renvoie vraie si les dates sont égales, faux sinon */
    public boolean equalsDateDeNaissance(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            return (getAnnee() == d.getAnnee()) && (getMois() == d.getMois()) && (getJour() == d.getJour());
        } else {
            return false;
        }
    }

    // precondition : 'o' est une instance de 'Date' :
    @Override
    public int compareTo(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            if (getAnnee() != d.getAnnee()) {
                return getAnnee() - d.getAnnee();
            }
            // ici on a forcement annee == d.annee :
            if (getMois() != d.getMois()) {
                return getMois() - d.getMois();
            }
            // ici on a forcement annee == d.annee et mois == d.mois :
            if (getJour() != d.getJour()) {
                return getJour() - d.getJour();
            }
            if (getHeure() != d.getHeure()) {
                return getHeure() - d.getHeure();
            } else {
                return getMinute() - d.getMinute();
            }
        } else {
            return 0;
        }
    }

    /* Comparaison de deux dates, +1 si plus grand, -1 si plus petit, 0 si égaux */
    public int compareToTrie(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            if (getAnnee() != d.getAnnee()) {
                return getAnnee() - d.getAnnee();
            }
            // ici on a forcement annee == d.annee :
            if (getMois() != d.getMois()) {
                return getMois() - d.getMois();
            }
            // ici on a forcement annee == d.annee et mois == d.mois :
            if (getJour() != d.getJour()) {
                return getJour() - d.getJour();
            }
        }
        return 0;

    }

    /* Affichage du code avec les balises XML */
    public String toXML() {
        String s = "<date>" + getAnnee();
        if (getMois() < 10) {
            s += "-0" + getMois();
        } else {
            s += "-" + getMois();
        }
        if (getJour() < 10) {
            s += "-0" + getJour();
        } else {
            s += "-" + getJour();
        }
        if (getMinute() != 0 && getHeure() != 0) {
            s += "T";
            if (getHeure() < 10) {
                s += "0" + getHeure();
            } else {
                s += getHeure();
            }
            if (getMinute() < 10) {
                s += ":0" + getMinute();
            } else {
                s += ":" + getMinute();
            }
        }
        s += "</date>";
        return s;
    }

    /**
     * @return the jour
     */
    public int getJour() {
        return jour;
    }

    /**
     * @return the mois
     */
    public int getMois() {
        return mois;
    }

    /**
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * @return the heure
     */
    public int getHeure() {
        return heure;
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

}
