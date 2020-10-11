package ru.progwards.java1.lessons.classes;

public class Animal {

    double weight;

    enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK,
    }

    AnimalKind an1 = AnimalKind.ANIMAL;
    AnimalKind an2 = AnimalKind.COW;
    AnimalKind an3 = AnimalKind.HAMSTER;
    AnimalKind an4 = AnimalKind.DUCK;

    enum FoodKind {
        UNKNOWN,
        HAY,
        CORN,
    }

    FoodKind food1 = FoodKind.UNKNOWN;
    FoodKind food2 = FoodKind.HAY;
    FoodKind food3 = FoodKind.CORN;

    public Animal(double weight) {
        this.weight = weight;
    }

    public AnimalKind getKind() {
        return an1;
    }

    public FoodKind getFoodKind() {
        return food1;
    }

    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff() {
        return  0.02;
    }

    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }

    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    public String toStringFull() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }


    class Cow extends Animal {

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

    class Hamster extends Animal {
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

    class Duck extends Animal {
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

    public static void main(String[] args) {
        System.out.println();
        }
    }



