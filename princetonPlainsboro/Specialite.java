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
    
    public static Specialite getSpe(String specialite){
        if (specialite.equals("autre")) {
            return Specialite.Autre;
        }
        if (specialite.equals("Anatomopathologie")) {
            return Specialite.Anatomopathologie;
        }
        if (specialite.equals("Anesthesiologie")) {
            return Specialite.Anesthésiologie;
        }
        if (specialite.equals("Bactériologie")) {
            return Specialite.Bactériologie;
        }
        if (specialite.equals("Biochimie")) {
            return Specialite.Biochimie;
        }
        if (specialite.equals("Cardiologie")) {
            return Specialite.Cardiologie;
        }
        if (specialite.equals("Chirurgie")) {
            return Specialite.Chirurgie;
        }
        if (specialite.equals("Cytogénétique")) {
            return Specialite.Cytogénétique;
        }
        if (specialite.equals("Dermatologie")) {
            return Specialite.Dermatologie;
        }
        if (specialite.equals("Endocrinologie")) {
            return Specialite.Endocrinologie;
        }
        if (specialite.equals("Généraliste")) {
            return Specialite.Généraliste;
        }
        if (specialite.equals("Gérontologie")) {
            return Specialite.Gérontologie;
        }
        if (specialite.equals("Gynécologie")) {
            return Specialite.Gynécologie;
        }
        if (specialite.equals("Hématologie")) {
            return Specialite.Hématologie;
        }
        if (specialite.equals("Hémodialyse")) {
            return Specialite.Hémodialyse;
        }
        if (specialite.equals("Hépatogastroentérologie")) {
            return Specialite.Hépatogastroentérologie;
        }
        if (specialite.equals("Immunologie")) {
            return Specialite.Immunologie;
        }
        if (specialite.equals("Mycologie")) {
            return Specialite.Mycologie;
        }
        if (specialite.equals("Néonatologie")) {
            return Specialite.Néonatologie;
        }
        if (specialite.equals("Néphrologie")) {
            return Specialite.Néphrologie;
        }
        if (specialite.equals("Neurochirurgie")) {
            return Specialite.Neurochirurgie;
        }
        if (specialite.equals("Neurologie")) {
            return Specialite.Neurologie;
        }
        if (specialite.equals("Nutrition")) {
            return Specialite.Nutrition;
        }
        if (specialite.equals("Odontologie")) {
            return Specialite.Odontologie;
        }
        if (specialite.equals("Oncologie")) {
            return Specialite.Oncologie;
        }
        if (specialite.equals("Ophtalmologie")) {
            return Specialite.Ophtalmologie;
        }
        if (specialite.equals("ORL")) {
            return Specialite.ORL;
        }
        if (specialite.equals("Orthopédie")) {
            return Specialite.Orthopédie;
        }
        if (specialite.equals("Pédiatrie")) {
            return Specialite.Pédiatrie;
        }
        if (specialite.equals("Pédopsychiatrie")) {
            return Specialite.Pédopsychiatrie;
        }
        if (specialite.equals("Pharmacologie")) {
            return Specialite.Pharmacologie;
        }
        if (specialite.equals("Pneumologie")) {
            return Specialite.Pneumologie;
        }
        if (specialite.equals("Psychiatrie")) {
            return Specialite.Psychiatrie;
        }
        if (specialite.equals("Radiologie")) {
            return Specialite.Radiologie;
        }
        if (specialite.equals("Réanimation")) {
            return Specialite.Réanimation;
        }
        if (specialite.equals("Rhumatologie")) {
            return Specialite.Rhumatologie;
        }
        if (specialite.equals("Sport")) {
            return Specialite.Sport;
        }
        if (specialite.equals("Toxicologie")) {
            return Specialite.Toxicologie;
        }
        if (specialite.equals("Traumatologie")) {
            return Specialite.Traumatologie;
        }
        if (specialite.equals("Urologie")) {
            return Specialite.Urologie;
        }
        if (specialite.equals("Virologie")) {
            return Specialite.Virologie;
        }
        return null;

    
    }
}
