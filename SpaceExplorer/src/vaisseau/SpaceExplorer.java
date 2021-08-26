package vaisseau;

public class SpaceExplorer extends Inventaire {

    private int vie;
    private int essence;
    private Inventaire inventaire;
    private boolean armeUtilisee;
    private boolean moteurUtilise;

    public SpaceExplorer() {
        vie = 100;
        essence = 1500;
        inventaire = new Inventaire();
    }


    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getEssence() {
        return essence;
    }

    public void setEssence(int essence) {
        this.essence = essence;
    }

    public Inventaire getInventaire() {
        return inventaire;
    }

    public void setInventaire(Inventaire inventaire) {
        this.inventaire = inventaire;
    }

    public boolean isArmeUtilisee() {
        return armeUtilisee;
    }

    public void setArmeUtilisee(boolean armeUtilisee) {
        this.armeUtilisee = armeUtilisee;
    }

    public boolean isMoteurUtilise() {
        return moteurUtilise;
    }

    public void setMoteurUtilise(boolean moteurUtilise) {
        this.moteurUtilise = moteurUtilise;
    }
}
