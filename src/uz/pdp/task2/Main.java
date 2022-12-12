package uz.pdp.task2;

import java.util.LinkedList;
import java.util.Random;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int num = (int)(random() * (500 - 300)+1*300);
            linkedList.add(num);
        }
        System.out.println(linkedList);

        for (int i = 0; i < linkedList.size(); i++) {
            if(linkedList.get(i) > 400){
                linkedList.remove(i);
                i--;
            }
        }
        System.out.println("remov() 400 dan katta sonlarni");
        System.out.println(linkedList);


    }
}
