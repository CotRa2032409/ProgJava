package Planetes;

import objets.Arme;
import objets.Molette;
import vaisseau.SpaceExplorer;

import java.util.ArrayList;

public class Mercure extends Planete {

    private Pirates pirates;

    public Mercure() {
        setNom("Mercure");
        listeObjets = new ArrayList<>();
        listeObjets.add(new Molette());
        listeObjets.add(new Arme());
    }

    @Override
    public void explorer(SpaceExplorer vaisseau) {
        int resultat = 0;
        vaisseau.setEssence(vaisseau.getEssence() - vaisseau.calculEssence(300));
        resultat = (int) (Math.random() * 100);
        for (int i = 0; i < listeObjets.size(); i++) {
            vaisseau.getInventaire().ajouterObjets(listeObjets.get(i));
            System.out.println("Bravo tu as obtenu : " + listeObjets.get(i));
        }

        if (resultat >= 65) {
            pirates.attaquer();
        }

    }
}
