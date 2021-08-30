package objets;

public class Credits implements Objets {

    @Override
    public void utiliser() {
        System.out.println("Tu viens de perdre ton crédit par terre et tu n'est plus capable de le retrouver.");
    }
}
