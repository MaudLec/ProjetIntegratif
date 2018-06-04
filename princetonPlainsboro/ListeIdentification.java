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

    public ListeIdentification(ArrayList<String> listeId, ArrayList<String> listeMdp) {
        this.listeId = listeId;
        this.listeMdp = listeMdp;
    }
    

    public ArrayList<String> getListeId() {
        return listeId;
    }

    public ArrayList<String> getListeMdp() {
        return listeMdp;
    }

    public void ajouterId(String id) {
        boolean b = true;
        for (int i = 0; i < listeId.size(); i++) {
            if (id.equals(listeId.get(i))) {
                b = false;
                //System.out.println("L'id existe déjà");
            }
        }
        if (b) {
            listeId.add(id);
            //System.out.println("L'id a bien été ajouté");
        }

    }

    public void ajouterMdp(String mdp) {
        if (listeId.size() > listeMdp.size()) {
            listeMdp.add(mdp);
        }
    }

}
