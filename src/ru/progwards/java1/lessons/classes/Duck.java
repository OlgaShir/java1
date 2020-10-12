package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {
    public Duck(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return an4;
    }

    @Override
    public FoodKind getFoodKind() {
        return food3;
    }

    @Override
    public double getFoodCoeff() {
        return 0.04;
    }
}
