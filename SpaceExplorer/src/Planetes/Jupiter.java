package Planetes;

import objets.Arme;
import objets.Molette;
import vaisseau.SpaceExplorer;

import java.util.ArrayList;

public class Jupiter extends Planete {

    public Jupiter() {
        setNom("Jupiter");
        setNature(false);
        setPirates(false);
        listeObjets = new ArrayList<>();
        listeObjets.add(new Arme());
        listeObjets.add(new Molette());
    }


    @Override
    public void explorer(SpaceExplorer vaisseau) {
        vaisseau.setEssence(vaisseau.getEssence() - vaisseau.calculEssence(350));

        for (objets.Objets listeObjet : listeObjets) {
            vaisseau.getInventaire().ajouterObjets(listeObjet);
        }

    }
}
