/**
 *
 * @author Julie Dubois, Suzanne Guegaden, Maud Leclerc, Vaea Tesan
 */
package princetonPlainsboro;

public enum Specialite {
    Autre,
    Anatomopathologie,
    Anesthésiologie,
    Bactériologie,
    Biochimie,
    Cardiologie,
    Chirurgie,
    Cytogénétique,
    Dermatologie,
    Endocrinologie,
    Généraliste,
    Gérontologie,
    Gynécologie,
    Hématologie,
    Hémodialyse,
    Hépatogastroentérologie,
    Immunologie,
    Mycologie,
    Néonatologie,
    Néphrologie,
    Neurochirurgie,
    Neurologie,
    Nutrition,
    Odontologie,
    Oncologie,
    Ophtalmologie,
    ORL,
    Orthopédie,
    Pédiatrie,
    Pédopsychiatrie,
    Pharmacologie,
    Pneumologie,
    Psychiatrie,
    Radiologie,
    Réanimation,
    Rhumatologie,
    Sport,
    Toxicologie,
    Traumatologie,
    Urologie,
    Virologie;

    /* Renvoie le nombre de spécialité */
    public int getNombreSpe() {
        return this.values().length;
    }

    /* Affichage de la spécialité avec les balises XML */
    public String toXML() {
        return ("<specialite>" + this.name() + "</specialite>");
    }
}
