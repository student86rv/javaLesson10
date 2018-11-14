package com.company;

public class Fruit {

    private FruitType type; // тип
    private Color color; // цвет
    private double weight; // вес (кг)
    private double priceKg; // цена за кг

    public Fruit(FruitType type) {
        this.type = type;
    }

    public Fruit(FruitType type, Color color, double weight, double priceKg) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.priceKg = priceKg;
    }

    public double price() {
        //с округлением до 2 знаков
        int tmp = (int)(weight * priceKg * 100);
        return tmp / 100.0;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weight=" + weight +
                ", priceKg=" + priceKg +
                '}';
    }
}
