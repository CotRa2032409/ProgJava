//Raphaël Côté

import Planetes.Planete;
import Planetes.Terre;
import vaisseau.SpaceExplorer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpaceExplorer spaceExplorer = new SpaceExplorer();
        int choix;

        System.out.println("Bienvenue dans Space Explorer!");

        for (int i = 0; i < spaceExplorer.getVie() || i < spaceExplorer.getEssence(); i++) {
            System.out.println("""
                    Que désirez-vous faire?
                    1. Examiner le vaisseau
                    2. Explorer une planète
                    3. Utiliser un objet dans l’inventaire
                    4. Revenir en arrière""");
            choix = sc.nextInt();
            Planete planete = new Terre();

            System.out.println("Votre choix : " + choix);
            switch (choix) {
                case 1: {
                    System.out.println("État du vaisseau : ");
                    System.out.println("Planète : " + planete.getNom());
                    System.out.println("Essence : " + spaceExplorer.getEssence());
                    System.out.println("Vie : " + spaceExplorer.getVie());

                    System.out.println("Inventaire : " + spaceExplorer.getInventaire());
                    planete.explorer(spaceExplorer);

                }
                case 2: {


                }

            }

        }

    }
}
