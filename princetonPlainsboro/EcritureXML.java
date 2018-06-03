package princetonPlainsboro;

import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class EcritureXML {

    private DossierMedical dm;
    private String nomFichier;

    //constructeur
    public EcritureXML(DossierMedical dm, String nomFichier) {
        this.dm = dm;
        this.nomFichier = nomFichier;
    }

    //Editer la liste de médecins
    public void editerMedecins() {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        try {
            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("src/donnees/" + nomFichier));
            writer.writeStartDocument();
            writer.writeStartElement("medecins");
            for (int i = 0; i < dm.getMedecins().size(); i++) {
                writer.writeStartElement("medecin");
                writer.writeStartElement("nom");
                writer.writeCharacters(dm.getMedecins().get(i).getNom());
                writer.writeEndElement();

                writer.writeStartElement("prenom");
                writer.writeCharacters(dm.getMedecins().get(i).getPrenom());
                writer.writeEndElement();

                writer.writeStartElement("specialite");
                writer.writeCharacters(dm.getMedecins().get(i).getSpecialite().toString());
                writer.writeEndElement();

                writer.writeStartElement("numtel");
                writer.writeCharacters(dm.getMedecins().get(i).getTelephone());
                writer.writeEndElement();

                writer.writeStartElement("identifiant");
                writer.writeCharacters(dm.getMedecins().get(i).getId());
                writer.writeEndElement();

                writer.writeStartElement("mdp");
                writer.writeCharacters(dm.getMedecins().get(i).getMdp());
                writer.writeEndElement();

                writer.writeEndElement();
            }
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();
            writer.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//Editer la liste des Serétaires médicales

//    public void editerSecretairesMed() {
//        XMLOutputFactory factory = XMLOutputFactory.newInstance();
//        try {
//            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("src/donnees/" + nomFichier));
//            writer.writeStartDocument();
//            writer.writeStartElement("secretairesmed");
//            for (int i = 0; i < dm.getSecretairesMed().size(); i++) {
//                writer.writeStartElement("secretairemed");
//                writer.writeStartElement("nom");
//                writer.writeCharacters(dm.getSecretairesMed().get(i).getNom());
//                writer.writeEndElement();
//
//                writer.writeStartElement("prenom");
//                writer.writeCharacters(dm.getSecretairesMed().get(i).getPrenom());
//                writer.writeEndElement();
//
//                writer.writeStartElement("identifiant");
//                writer.writeCharacters(dm.getSecretairesMed().get(i).getId());
//                writer.writeEndElement();
//
//                writer.writeStartElement("mdp");
//                writer.writeCharacters(dm.getSecretairesMed().get(i).getMdp());
//
//                writer.writeEndElement();
//
//            }
//            writer.writeEndElement();
//            writer.writeEndDocument();
//            writer.flush();
//            writer.close();
//        } catch (XMLStreamException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
////Editer la liste des Secrétaires afministratives
//
//    public void editerSecretairesAdmin() {
//        XMLOutputFactory factory = XMLOutputFactory.newInstance();
//        try {
//            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("src/donnees/" + nomFichier));
//            writer.writeStartDocument();
//            writer.writeStartElement("secretairesadmin");
//            for (int i = 0; i < dm.getSecretairesAdmin().size(); i++) {
//                writer.writeStartElement("secretaireadmin");
//                writer.writeStartElement("nom");
//                writer.writeCharacters(dm.getSecretairesAdmin().get(i).getNom());
//                writer.writeEndElement();
//
//                writer.writeStartElement("prenom");
//                writer.writeCharacters(dm.getSecretairesAdmin().get(i).getPrenom());
//                writer.writeEndElement();
//
//                writer.writeStartElement("identifiant");
//                writer.writeCharacters(dm.getSecretairesAdmin().get(i).getId());
//                writer.writeEndElement();
//
//                writer.writeStartElement("mdp");
//                writer.writeCharacters(dm.getSecretairesAdmin().get(i).getMdp());
//
//                writer.writeEndElement();
//
//            }
//            writer.writeEndElement();
//            writer.writeEndDocument();
//            writer.flush();
//            writer.close();
//        } catch (XMLStreamException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//Editer la liste des patients
    public void editerPatients() {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        try {
            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("src/donnees/" + nomFichier));
            writer.writeStartDocument();
            writer.writeStartElement("patients");
            for (int i = 0; i < dm.getPatients().size(); i++) {
                writer.writeStartElement("patient");
                writer.writeStartElement("nom");
                writer.writeCharacters(dm.getPatients().get(i).getNom());
                writer.writeEndElement();

                writer.writeStartElement("prenom");
                writer.writeCharacters(dm.getPatients().get(i).getPrenom());
                writer.writeEndElement();

                writer.writeStartElement("numsecu");
                writer.writeCharacters(dm.getPatients().get(i).getNumSecu() + "");
                writer.writeEndElement();

                writer.writeStartElement("rue");
                writer.writeCharacters(dm.getPatients().get(i).getAdresse().getRue());
                writer.writeEndElement();

                writer.writeStartElement("codePostal");
                writer.writeCharacters(dm.getPatients().get(i).getAdresse().getCodePostal());
                writer.writeEndElement();

                writer.writeStartElement("ville");
                writer.writeCharacters(dm.getPatients().get(i).getAdresse().getVille());
                writer.writeEndElement();

                writer.writeStartElement("naissance");
                writer.writeCharacters(dm.getPatients().get(i).getNaissance().datePourEcritureXML());
                writer.writeEndElement();

                writer.writeEndElement();
            }
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();
            writer.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//Editer la liste de fiches de soin (informations de date, patient, médecin, et de actes et couts)
    public void editerFichesDeSoins() {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        try {
            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("src/donnees/" + nomFichier));
            writer.writeStartDocument();
            writer.writeStartElement("dossiers");
            for (int i = 0; i < dm.getFiches().size(); i++) {
                writer.writeStartElement("fichesDeSoins");

                //date
                writer.writeStartElement("date");
                writer.writeCharacters(dm.getFiches().get(i).getDate().datePourEcritureXML());
                writer.writeEndElement();

                //medecin
                writer.writeStartElement("medecin");
                writer.writeStartElement("nom");
                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getNom());
                writer.writeEndElement();

                writer.writeStartElement("prenom");
                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getPrenom());
                writer.writeEndElement();

                writer.writeStartElement("specialite");
                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getSpecialite().toString());
                writer.writeEndElement();

                writer.writeStartElement("numtel");
                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getTelephone());
                writer.writeEndElement();

                writer.writeEndElement();

                //patient
                writer.writeStartElement("patient");
                writer.writeStartElement("nom");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNom());
                writer.writeEndElement();

                writer.writeStartElement("prenom");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getPrenom());
                writer.writeEndElement();

                writer.writeStartElement("numsecu");
                writer.writeStartElement("sexe");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNumSecu().getSexe()+"");
                writer.writeEndElement();
                
                writer.writeStartElement("annee");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNumSecu().getAnnee()+"");
                writer.writeEndElement();
                
                writer.writeStartElement("mois");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNumSecu().getMois()+"");
                writer.writeEndElement();
                
                writer.writeStartElement("dep");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNumSecu().getDep()+"");
                writer.writeEndElement();
                
                writer.writeStartElement("comm");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNumSecu().getComm()+"");
                writer.writeEndElement();
                
                writer.writeStartElement("cle");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNumSecu().getCle()+"");
                writer.writeEndElement();
                
                writer.writeStartElement("numero");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNumSecu().getNumero()+"");
                writer.writeEndElement();
                
                writer.writeEndElement();

                writer.writeStartElement("rue");
                writer.writeCharacters(dm.getPatients().get(i).getAdresse().getRue());
                writer.writeEndElement();

                writer.writeStartElement("codePostal");
                writer.writeCharacters(dm.getPatients().get(i).getAdresse().getCodePostal());
                writer.writeEndElement();

                writer.writeStartElement("ville");
                writer.writeCharacters(dm.getPatients().get(i).getAdresse().getVille());
                writer.writeEndElement();

                writer.writeStartElement("naissance");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNaissance().dateDeNaissancePourEcritureXML());
                writer.writeEndElement();

                writer.writeStartElement("sexe");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getSexe().toString());
                writer.writeEndElement();

                writer.writeEndElement();

                //actes
                for (int j = 0; j < dm.getFiches().get(i).getActes().size(); j++) {
                    writer.writeStartElement("acte");
                    writer.writeStartElement("code");
                    writer.writeCharacters(dm.getFiches().get(i).getActe(j).getCode() + "");
                    writer.writeEndElement();

                    writer.writeStartElement("coef");
                    writer.writeCharacters(dm.getFiches().get(i).getActe(j).getCoef() + "");
                    writer.writeEndElement();

                    writer.writeStartElement("cout");
                    writer.writeCharacters(dm.getFiches().get(i).getActe(j).cout() + "");
                    writer.writeEndElement();

                    writer.writeStartElement("observation");
                    writer.writeCharacters(dm.getFiches().get(i).getActe(j).getObs());
                    writer.writeEndElement();

                    writer.writeEndElement();

                }

                //cout
                writer.writeStartElement("cout");
                writer.writeCharacters(dm.getFiches().get(i).coutTotal() + "");
                writer.writeEndElement();

                writer.writeEndElement();
            }
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();
            writer.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
