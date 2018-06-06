/**
 *
 * @author Julie Dubois, Suzanne Guegaden, Maud Leclerc, Vaea Tesan
 */
package princetonPlainsboro;

public enum TypeActe {
    diagnostique, therapeutique;

    /* Affichage du type d'acte avec les balises XML */
     public String toXML() {
        return ("<type>" + this.name() + "</type>");
    }
    
    public static TypeActe getType(String type) {
        if (type.toLowerCase().equals("therapeutique") || type.toLowerCase().equals("thérapeutique") ) {
            return TypeActe.therapeutique;
        }
        if (type.toLowerCase().equals("diagnostique")) {
            return TypeActe.diagnostique;
        }
        return null;
    }
    
}
