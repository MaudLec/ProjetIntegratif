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
}
