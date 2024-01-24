package controller;

import entity.Fruit;
import entity.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> lf = new ArrayList<>();
        HashMap<String, ArrayList<Order>> ht = new HashMap<>();

        Managerment manager = new Managerment();

        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.createFruit(lf);
                    break;
                case 2:
                    manager.viewOrder(ht);
                    break;
                case 3:
                    manager.shopping(lf, ht);
                    break;
                case 4:
                    return;
            }
        }
    }
}