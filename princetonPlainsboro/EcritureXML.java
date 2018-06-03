/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maudl
 */
public class EcritureXML {

    private DossierMedical dm;
    private String nomFichier;

    //constructeur
    public EcritureXML(DossierMedical dm, String nomFichier) {
        this.dm = dm;
        this.nomFichier = nomFichier;
    }
//Editer le dossier medical
    public void editerDossier() {
        OutputStream os;
        Writer osw;
        try {
            os = new FileOutputStream("src/donnees/" + nomFichier);
            osw = new OutputStreamWriter(os);
            String s = ("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n");
            s += "<dossiers>\n";
            for (int i = 0; i < dm.getFiches().size(); i++) {
                s += dm.getFiches().get(i).toXML();
            }
            s += "\n</dossiers>";
            osw.write(s);
            osw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ecriture2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ecriture2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Editer la liste de médecins
    public void editerMedecins() {
        OutputStream os;
        Writer osw;
        try {
            os = new FileOutputStream("src/donnees/" + nomFichier);
            osw = new OutputStreamWriter(os);
            String s = ("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n");
            s += "<medecins>\n";
            for (int i = 0; i < dm.getMedecins().size(); i++) {
                s += dm.getMedecins().get(i).toXML();
            }
            s += "\n</medecins>";
            osw.write(s);
            osw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ecriture2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ecriture2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//Editer la liste des patients
    public void editerPatients() {
        OutputStream os;
        Writer osw;
        try {
            os = new FileOutputStream("src/donnees/" + nomFichier);
            osw = new OutputStreamWriter(os);
            String s = ("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n");
            s += "<patients>\n";
            for (int i = 0; i < dm.getPatients().size(); i++) {
                s += dm.getPatients().get(i).toXML();
            }
            s += "\n</patients>";
            osw.write(s);
            osw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ecriture2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ecriture2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
