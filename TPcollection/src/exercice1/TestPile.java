package exercice1;

public class TestPile {
    public static void main(String[] args) {
        // Testing with Integers
        System.out.println("--- Pile of Integers ---");
        PileGen<Integer> pileInt = new PileGen<>();
        pileInt.add(10);
        pileInt.add(20);
        pileInt.add(30);
        pileInt.affiche();
        System.out.println("Removed: " + pileInt.remove());
        System.out.println("New Size: " + pileInt.size());

        // Testing with Strings
        System.out.println("\n--- Pile of Strings ---");
        PileGen<String> pileStr = new PileGen<>();
        pileStr.add("Java");
        pileStr.add("Collections");
        pileStr.affiche();
        System.out.println("Top element: " + pileStr.getSommet());
    }
}