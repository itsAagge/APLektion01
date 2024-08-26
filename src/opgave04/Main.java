package opgave04;

import bst.BSTreeSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> intComparator = Comparator.comparingInt(Integer::intValue);
        BSTreeSet<Integer> set1 = new BSTreeSet<>(intComparator);
        ArrayList<Integer> list = new ArrayList<>(List.of(45,22,77,11,30,90,15,25,88));
        set1.addAll(list);

        set1.printLayers();
        System.out.println();

        System.out.println("Max: " + set1.max());
        System.out.println();

        System.out.println("Removing min");
        set1.removeMin();
        set1.printLayers();
        System.out.println();

        System.out.println("Removing min");
        set1.removeMin();
        set1.printLayers();
        System.out.println();

        System.out.println("Removing min");
        set1.removeMin();
        set1.printLayers();
    }
}
