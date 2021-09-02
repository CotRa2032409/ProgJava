package Planetes;

import objets.Arme;
import objets.Molette;
import vaisseau.SpaceExplorer;

import java.util.ArrayList;

public class Jupiter extends Planete {

    private Pirates pirates;

    public Jupiter() {
        setNom("Jupiter");
        listeObjets = new ArrayList<>();
        listeObjets.add(new Arme());
        listeObjets.add(new Molette());
    }


    @Override
    public void explorer(SpaceExplorer vaisseau) {
        int resultat = 0;
        vaisseau.setEssence(vaisseau.getEssence() - vaisseau.calculEssence(350));
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
