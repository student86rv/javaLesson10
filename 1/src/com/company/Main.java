package com.company;

public class Main {

    public static void main(String[] args) {

        Fruit redApple = new Fruit(FruitType.APPLE, Color.RED, 0.146, 10.49);
        System.out.println("redApple: " + redApple);
        System.out.println("Red apple price: " +redApple.price());
        System.out.println("---------------------------------------------");

        Fruit greenApple = new Fruit(FruitType.APPLE, Color.GREEN, 0.23, 12.8);
        System.out.println("greenApple: " +greenApple);
        System.out.println("Green apple price: "+greenApple.price());
        System.out.println("---------------------------------------------");

        Fruit lemon = new Fruit(FruitType.LEMON, Color.YELLOW, 0.11, 16.5);
        System.out.println("lemon: " +lemon);
        System.out.println("Lemon price: "+lemon.price());
        System.out.println("---------------------------------------------");

        Fruit banana = new Fruit(FruitType.BANANA, Color.YELLOW, 0.19, 22.7);
        System.out.println("banana: " +banana);
        System.out.println("Banana price: "+banana.price());
        System.out.println("=============================================");

        Fruit[] arr = new Fruit[4];
        arr[0] = redApple;
        arr[1] = greenApple;
        arr[2] = lemon;
        arr[3] = banana;

        printPrice(arr);
    }
    private static void printPrice(Fruit[] arr) {
        double price = 0;
        for (int i = 0; i < arr.length; i++) {
            price += arr[i].price();
        }
        System.out.println("Sum price: " + price);
    }
}
