package Planetes;

import objets.Arme;
import objets.Molette;
import vaisseau.SpaceExplorer;

public class Mercure extends Planete{

    public Mercure() {
        setNom("Mercure");
        setNature(false);
        setPirates(true);
        listeObjets.add(new Molette());
        listeObjets.add(new Arme());
    }

    @Override
    public void explorer(SpaceExplorer vaisseau) {
        if (vaisseau.isMoteurUtilise()) {
            vaisseau.setEssence(vaisseau.getEssence() - 75);
        }
        else
            vaisseau.setEssence(vaisseau.getEssence() - 150);

        for (objets.Objets listeObjet : listeObjets) {
            vaisseau.getInventaire().ajouterObjets(listeObjet);
        }


    }
}
