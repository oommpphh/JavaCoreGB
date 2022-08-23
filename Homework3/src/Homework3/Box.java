package Homework3;

import java.util.ArrayList;


public class Box<T extends Fruit> {
    private double weightFruit = 0.0;
    ArrayList<T> fruits = new ArrayList();

    public <F> Box(double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(Box<T> boxFruit){
        System.out.println("Перед пересыпанием. Коробка 1: " + fruits.size());
        System.out.println("Перед пересыпанием. Коробка 2: " + boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println("После пересыпанием. Коробка 1: " + fruits.size());
        System.out.println("После пересыпанием. Коробка 2: " + boxFruit.fruits.size());
    }
}