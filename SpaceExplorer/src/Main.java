//Raphaël Côté

import objets.Essence;
import vaisseau.SpaceExplorer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpaceExplorer spaceExplorer = new SpaceExplorer();
        int choix;
        Essence essence = new Essence();

        System.out.println("Bienvenue dans Space Explorer!");

        for (int i = 0; i < spaceExplorer.getVie() || i < spaceExplorer.getEssence(); i++) {
            System.out.println("""
                    Que désirez-vous faire?
                    1. Examiner le vaisseau
                    2. Explorer une planète
                    3. Utiliser un objet dans l’inventaire
                    4. Revenir en arrière""");
            choix = sc.nextInt();
            System.out.println("Votre choix : " + choix);
            switch (choix) {
                case 1: {
                    System.out.println("État du vaisseau : ");
                    System.out.println("Planète : ");
                    System.out.println("Essence : " + spaceExplorer.getEssence());
                    System.out.println("Vie : " + spaceExplorer.getVie());

                    System.out.println("Inventaire : " + spaceExplorer.getInventaire());


                }
                case 2: {


                }

            }

        }

    }
}
