package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {

    public Cow(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return an2;
    }

    @Override
    public FoodKind getFoodKind() {
        return food2;
    }

    @Override
    public double getFoodCoeff() {
        return 0.05;
    }
}
