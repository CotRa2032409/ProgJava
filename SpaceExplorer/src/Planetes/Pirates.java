package Planetes;

import vaisseau.SpaceExplorer;

public class Pirates extends SpaceExplorer{

    private SpaceExplorer vaisseau;

    public void attaquer() {
        System.out.println("Vous êtes attaqué par des pirates");
        if (vaisseau.isArmeUtilisee()) {
            vaisseau.setVie(vaisseau.getVie() - 20);
            System.out.println("Vous subissez : " + vaisseau.getVie() + "points de vie" +
                    "Mais grâce à votre arme vous subissez moitié moins de dégats");
        }
        else
            vaisseau.setVie(vaisseau.getVie() - 40);
        System.out.println("Vous subissez : " + vaisseau.getVie() + "points de vie");
    }
}
