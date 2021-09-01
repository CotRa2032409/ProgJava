package Planetes;

import objets.Credits;
import objets.Essence;
import objets.Molette;
import objets.Moteur;
import vaisseau.SpaceExplorer;

import java.util.ArrayList;

public class Terre extends Planete {

    private Pirates pirates;

    public Terre() {
        setNom("Terre");
        listeObjets = new ArrayList<>();

        listeObjets.add(new Molette());
        listeObjets.add(new Essence());
        listeObjets.add(new Credits());
    }

    @Override
    public void explorer(SpaceExplorer vaisseau) {
        int resultat = 0;
        vaisseau.setEssence(vaisseau.getEssence() - vaisseau.calculEssence(200));
        if (resultat >= 75)
            listeObjets.add(new Moteur());
        for (int i = 0; i < listeObjets.size(); i++) {
            vaisseau.getInventaire().ajouterObjets(listeObjets.get(i));
            System.out.println("Bravo tu as obtenu : " + listeObjets.get(i));
        }
        if (resultat >= 65) {
            pirates.attaquer();
        }
    }
}
