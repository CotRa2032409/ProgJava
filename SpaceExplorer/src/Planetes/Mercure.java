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
        vaisseau.setEssence(vaisseau.getEssence() - vaisseau.calculEssence(300));

        for (objets.Objets listeObjet : listeObjets) {
            vaisseau.getInventaire().ajouterObjets(listeObjet);
        }


    }
}
