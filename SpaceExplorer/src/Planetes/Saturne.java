package Planetes;

import objets.Credits;
import objets.Essence;
import objets.Objets;
import vaisseau.SpaceExplorer;

import java.util.ArrayList;

public class Saturne extends Planete {

    private Pirates pirates;

    public Saturne() {
        setNom("Saturne");
        listeObjets = new ArrayList<>();
        listeObjets.add(new Essence());
        listeObjets.add(new Credits());
    }

    @Override
    public void explorer(SpaceExplorer vaisseau) {
        int resultat = 0;
        vaisseau.setEssence(vaisseau.getEssence() - vaisseau.calculEssence(400));
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
