/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.util.ArrayList;

/**
 *
 * Liste de tous les identifiants & leur mot de passe
 */
public class ListeIdentification {

    private ArrayList<String> listeId;
    private ArrayList<String> listeMdp;

    public ListeIdentification() {
        listeId = new ArrayList<String>();
        listeMdp = new ArrayList<String>();

    }

    public ArrayList<String> getListeId() {
        return listeId;
    }

    public ArrayList<String> getListeMdp() {
        return listeMdp;
    }

    public void ajouterId(String id) {

        listeId.add(id);

    }

    public void ajouterMdp(String mdp) {
        if (listeId.size() > listeMdp.size()) {
            listeMdp.add(mdp);
        }
    }

}
