package Planetes;

import objets.Objets;
import vaisseau.SpaceExplorer;

import java.util.ArrayList;


public abstract class Planete {
    ArrayList<Objets> listeObjets;
    protected String nom;

    public Planete() {

    }

    public abstract void explorer(SpaceExplorer vaisseau);

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
