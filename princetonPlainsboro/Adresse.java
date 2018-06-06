package princetonPlainsboro;

/**
 *
 * @author leclemau
 */
public class Adresse {

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    private String rue;
    private String codePostal;
    private String ville;
    
    public Adresse(String rue, String codePostal, String ville){
        this.rue = rue;
        this.codePostal= codePostal;
        this.ville = ville;
    }

    
    /* Affiche les informations de l'adresse */
    public String toString(){
        return(this.getRue() +" "+ this.getCodePostal() +" "+ this.getVille());
    }
    
    public String getDepartement(){
        return(""+ this.codePostal.charAt(0) + this.codePostal.charAt(1));
    }

    public String getRue() {
        return rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }
    
    /* Affichage de l'adresse avec les balises XML pour la classe EcritureXML */
    public String toXML(){
        return("<adresse>" +"<rue>" + rue + "</rue>" + "<codepostal>" + codePostal + "</codepostal>" + "<ville>" + ville + "</ville>" + "</adresse>");
    }
    
}
