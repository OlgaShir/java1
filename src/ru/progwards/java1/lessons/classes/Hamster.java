package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {
    public Hamster(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind() {
        return an3;
    }

    @Override
    public FoodKind getFoodKind() {
        return food3;
    }

    @Override
    public double getFoodCoeff() {
        return 0.03;
    }
}