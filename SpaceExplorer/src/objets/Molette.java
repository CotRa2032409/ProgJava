package objets;

import vaisseau.SpaceExplorer;

public class Molette implements Objets {

    private final int reparation = 50;
    private SpaceExplorer vaisseau;

    @Override
    public void utiliser() {
        vaisseau.setVie(vaisseau.getVie() + reparation);
        System.out.println("Tu viens de réparer ton vaisseau pour : " + reparation + " points de vie");
    }
}
