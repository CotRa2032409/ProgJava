package vaisseau;

import objets.Objets;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    protected List<Objets> objets =new ArrayList<Objets>();

    public void ajouterObjets(Objets objet){
        objets.add(objet);
    }

}
