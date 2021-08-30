package objets;

import vaisseau.SpaceExplorer;

public class Arme implements Objets {

    private SpaceExplorer vaisseau;
    private final int nbUtilisation = 1;


    @Override
    public void utiliser() {
        vaisseau.setArmeUtilisee(true);
        System.out.println("Grâce à cette arme très puissante, tu ne prendras que la moitié des dégâts quand des pirates t'attaquerons." +
                "UNE SEULE UTILISATION POSSIBLE!");
    }
}
