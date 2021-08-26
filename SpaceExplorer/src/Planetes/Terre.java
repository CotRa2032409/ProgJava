package Planetes;

import objets.Credits;
import objets.Essence;
import objets.Molette;
import objets.Moteur;
import vaisseau.SpaceExplorer;

import java.util.ArrayList;

public class Terre extends Planete {

    public Terre() {
        setNom("Terre");
        setNature(true);
        setPirates(false);
        listeObjets = new ArrayList<>();
        listeObjets.add(new Moteur());
        listeObjets.add(new Molette());
        listeObjets.add(new Essence());
        listeObjets.add(new Credits());
    }

    @Override
    public void explorer(SpaceExplorer vaisseau) {
        vaisseau.setEssence(vaisseau.getEssence() - 200);
        for (objets.Objets listeObjet : listeObjets) {
            vaisseau.getInventaire().ajouterObjets(listeObjet);
        }

    }
}
