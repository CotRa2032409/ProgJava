package objets;

import vaisseau.SpaceExplorer;

public class Essence implements Objets {

    private final int remplissage = 1250;
    private SpaceExplorer vaisseau;

    @Override
    public void utiliser() {
        vaisseau.setEssence(vaisseau.getEssence() + remplissage);
        System.out.println("Tu viens de remplir le réservoir de carburant de ton vaisseau pour : " + remplissage + " litres d'essence");
    }
}
