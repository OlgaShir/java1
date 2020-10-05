package ru.progwards.java1.lessons.classes;

public class Animal {
    public Animal(double weight) {
        this.weight = weight;
    }

    public enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK,
    }

    public Animal getKind() {
        AnimalKind an1 = AnimalKind.ANIMAL;
        return an1;
    }

    public enum FoodKind {
        UNKNOWN,
        HAY,
        CORN,
    }

    public FoodKind getFoodKind() {
        FoodKind food1 = FoodKind.UNKNOWN;
        return food1;
    }

    public String toString() {
        return "I am" + AnimalKind + "eat" + FoodKind;
    }

    public double getWeight() {
        return weigth;
    }
    public double getFoodCoeff() {
        return 0.02;
    }

    public class Cow extends Animal {

        @Override
        public AnimalKind getKind() {
            AnimalKind an2 = AnimalKind.COW;
            return an2;
        }

        @Override
        public FoodKind getFoodKind() {
            FoodKind food2 = FoodKind.HAY;
            return food2;
        }

        @Override
        public double getFoodCoeff() {
            return 0.05;
        }
    }

    public class Hamster extends Animal {

        @Override
        public AnimalKind getKind() {
            AnimalKind an3 = AnimalKind.HAMSTER;
            return an3;
        }

        @Override
        public FoodKind getFoodKind() {
            FoodKind food3 = FoodKind.CORN;
            return food3;
        }

        @Override
        public double getFoodCoeff() {
            return 0.03;
        }
    }

    public class Duck extends Animal {

        @Override
        public AnimalKind getKind() {
            AnimalKind an4 = AnimalKind.DUCK;
            return an4;
        }

        @Override
        public FoodKind getFoodKind() {
            FoodKind food3 = FoodKind.CORN;
            return food3;
        }

        @Override
        public double getFoodCoeff() {
            return 0.04;
        }
    }
public double calculateFoodWeight() {
        return Animal(double weight) * double getFoodCoeff();
}
public String toStringFull() {
        return "I am" + AnimalKind +", eat" + FoodKind + calculateFoodWeight();
}

    public static void main(String[] args) {

    }
}


