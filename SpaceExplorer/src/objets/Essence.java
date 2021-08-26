package objets;

import vaisseau.SpaceExplorer;

public class Essence implements Objets {

    private SpaceExplorer vaisseau;

    @Override
    public void utiliser() {
        vaisseau.setEssence(vaisseau.getEssence() + 1000);
    }
}
