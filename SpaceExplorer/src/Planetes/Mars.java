package Planetes;

import objets.Credits;
import vaisseau.SpaceExplorer;

public class Mars extends Planete {

    public Mars() {
        setNom("Mars");
        setNature(true);
        setPirates(true);
        listeObjets.add(new Credits());
    }

    @Override
    public void explorer(SpaceExplorer vaisseau) {
        vaisseau.setEssence(vaisseau.getEssence() - 250);
        for (objets.Objets listeObjet : listeObjets) {
            vaisseau.getInventaire().ajouterObjets(listeObjet);
        }

    }
}
