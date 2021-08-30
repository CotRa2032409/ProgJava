package objets;

import vaisseau.SpaceExplorer;

public class Moteur implements Objets {

    private SpaceExplorer vaisseau;
    private final int nbUtilisation = 2;

    @Override
    public void utiliser() {
        vaisseau.setMoteurUtilise(true);
        System.out.println("Avec ce moteur fraîchement utilisé, tu consommeras deux fois moins d'essence" +
                "DEUX UTILISATIONS SEULEMENT!");

    }
}
