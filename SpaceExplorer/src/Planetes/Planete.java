package Planetes;

import objets.Objets;
import vaisseau.SpaceExplorer;

import java.util.ArrayList;


public abstract class Planete {
    ArrayList<Objets> listeObjets;
    protected String nom;
    protected boolean pirates;
    protected boolean nature;

    public abstract void explorer(SpaceExplorer vaisseau);

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isPirates() {
        return pirates;
    }

    public void setPirates(boolean pirates) {
        this.pirates = pirates;
    }

    public boolean isNature() {
        return nature;
    }

    public void setNature(boolean nature) {
        this.nature = nature;
    }
}
