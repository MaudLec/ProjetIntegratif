/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.util.ArrayList;

/**
 *
 * @author GSuz-
 */
public class ListeIdentification {

    private ArrayList<String> id;
    private ArrayList<String> mdp;

    public ListeIdentification() {
        id = new ArrayList<String>();
        mdp = new ArrayList<String>();

    }

    public ArrayList<String> getId() {
        return id;
    }

    public ArrayList<String> getMdp() {
        return mdp;
    }

}
