package princetonPlainsboro;

public class SecretaireMed {

        private String nom;
        private String prenom;
        private String id;
        private String mdp;

        public SecretaireMed(String nom, String prenom, String id, String mdp){
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

        public String getId() {
            return id;
        }

        public String getMdp() {
            return mdp;
        }


}
