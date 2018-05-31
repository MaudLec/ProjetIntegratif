package princetonPlainsboro;

public class SecretaireMed {

    class Patient {

        private String nom;
        private String prenom;
        private int id;
        private String mdp;

        public Patient(String nom, String prenom, int id, String mdp){
            this.nom = nom;
            this.prenom = prenom;
            this.id = id;
            this.mdp = mdp;
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public int getId() {
            return id;
        }

        public String getMdp() {
            return mdp;
        }

    }

}
