package objets;

public class Credits implements Objets {

    @Override
    public void utiliser() {
        System.out.println("Tu viens de perdre ton crédit dans le sol et n'est plus capable de le retrouver.");
    }
}
