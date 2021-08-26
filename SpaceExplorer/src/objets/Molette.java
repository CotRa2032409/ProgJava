package objets;

import vaisseau.SpaceExplorer;

public class Molette implements Objets {

    private SpaceExplorer vaisseau;

    @Override
    public void utiliser() {
        vaisseau.setVie(vaisseau.getVie());
    }
}
