package opgave03;

import bst.BSTreeSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> intComparator = Comparator.comparingInt(Integer::intValue);
        BSTreeSet<Integer> set1 = new BSTreeSet<>(intComparator);
        ArrayList<Integer> list = new ArrayList<>(List.of(45,22,77,11,30,90,15,25,88));
        set1.addAll(list);

        System.out.println("StringBuilder Inorder");
        System.out.println(set1);

        System.out.println("Height: " + set1.height());

        System.out.print("Set: ");
        Set<Integer> ints = set1.toSet();
        System.out.println(ints);

        System.out.println("Leaf count: " + set1.leafCount());

        set1.printLayers();
    }
}
