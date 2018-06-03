/**
 *
 * @author Julie Dubois, Suzanne Guegaden, Maud Leclerc, Vaea Tesan
 */
package princetonPlainsboro;


public enum TypeActe {
        diagnostique, therapeutique;
            public String toXML(){
            return("<type>" + this.name() + "</type>" );
        }
}
