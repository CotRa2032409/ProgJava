package Planetes;

import objets.Credits;
import vaisseau.SpaceExplorer;

import java.util.ArrayList;

public class Mars extends Planete {

    private Pirates pirates;

    public Mars() {
        setNom("Mars");
        listeObjets = new ArrayList<>();
        listeObjets.add(new Credits());
    }

    @Override
    public void explorer(SpaceExplorer vaisseau) {
        int resultat = 0;
        vaisseau.setEssence(vaisseau.getEssence() - vaisseau.calculEssence(250));
        for (int i = 0; i < listeObjets.size(); i++) {
            vaisseau.getInventaire().ajouterObjets(listeObjets.get(i));
            System.out.println("Bravo tu as obtenu : " + listeObjets.get(i));
        }
        if (resultat >= 65) {
            pirates.attaquer();
        }

    }
}
