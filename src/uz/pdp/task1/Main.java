package uz.pdp.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(10);
        set.add("Bir");
        set.add("Ikki");
        set.add("Uch");
        set.add("Turt");
        set.add("Besh");
        set.add("Olti");
        set.add("Yetti");
        set.add("Sakkiz");
        set.add("To'qqiz");
        set.add("O'n");


        System.out.println("Iterator");
        Iterator<String> stringIterator = set.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        System.out.println();
        System.out.println("foreach");
        set.forEach(s -> System.out.println(s));


    }
}
