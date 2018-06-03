package princetonPlainsboro;


enum Sexe{
        M,
        F,
        Autre;
               public String toXML(){
            return("<sexe>" + this.name() + "</sexe>");
        }
}
