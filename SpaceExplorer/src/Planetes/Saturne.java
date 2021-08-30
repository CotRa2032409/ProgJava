package Planetes;

import objets.Credits;
import objets.Essence;
import objets.Objets;
import vaisseau.SpaceExplorer;

import java.util.ArrayList;

public class Saturne extends Planete{

    public Saturne() {
        setNom("Saturne");
        setNature(true);
        setPirates(true);
        listeObjets = new ArrayList<>();
        listeObjets.add(new Essence());
        listeObjets.add(new Credits());
    }

    @Override
    public void explorer(SpaceExplorer vaisseau) {
        vaisseau.setEssence(vaisseau.getEssence() - vaisseau.calculEssence(400));
        for (Objets listeObjet : listeObjets) {
            vaisseau.getInventaire().ajouterObjets(listeObjet);
        }


    }
}
