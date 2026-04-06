package exercice1;
import java.util.ArrayList;

public class PileGen<T> {
    // Using ArrayList<T> as requested, removing the 'pos' field 
    private ArrayList<T> tab;

    public PileGen() {
        // Initializing the ArrayList 
        this.tab = new ArrayList<>();
    }

    // Adding an element to the top of the stack 
    public void add(T e) {
        this.tab.add(e);
    }

    // Removing and returning the top element [cite: 24, 49]
    public T remove() {
        if (this.estVide()) {
            return null; 
        }
        // In an ArrayList, the last element is at index size() - 1 
        return this.tab.remove(this.tab.size() - 1);
    }

    public boolean estVide() {
        return this.tab.isEmpty(); // Or this.tab.size() == 0 [cite: 31, 49]
    }

    public int size() {
        return this.tab.size(); // Using ArrayList's size() method 
    }

    // Classic traversal for display [cite: 50]
    public void affiche() {
        for (int i = 0; i < this.tab.size(); i++) {
            System.out.println(this.tab.get(i));
        }
    }

    public T getSommet() {
        if (this.estVide()) {
            return null;
        }
        return this.tab.get(this.tab.size() - 1);
    }
}