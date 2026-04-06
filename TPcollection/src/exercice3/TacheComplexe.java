package exercice3;

import java.util.ArrayList;
import java.util.Collection;

public class TacheComplexe implements Tache {
    private String nom;
    // Using a generic collection to store sub-tasks
    private Collection<Tache> sousTaches;

    public TacheComplexe(String nom) {
        this.nom = nom;
        this.sousTaches = new ArrayList<>();
    }

    public void ajouter(Tache t) {
        this.sousTaches.add(t); 
    }

    public void supprimer(Tache t) {
        this.sousTaches.remove(t); 
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public int getCout() {
        int total = 0;
        // Calculating the sum of all sub-task costs
        for (Tache t : sousTaches) {
            total += t.getCout();
        }
        return total;
    }
}