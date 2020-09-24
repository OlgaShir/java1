package ru.progwards.java1.lessons.compare_if_cycles;

class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        while (number > 0) {
            if (number % 10 == digit)
                return true;
            number = number / 10;
        }
        return false;

    }

    public static int fiboNumber (int n){
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fiboNumber(n - 1) + fiboNumber(n - 2);
        }
    }

    public static boolean isGoldenTriangle(int a, int b, int c){

        if (a == b && (double)a/c > 1.61703 && (double)a/c < 1.61903){
            System.out.println("золото");
            return true;}
        else if (c == b && b/(double)a > 1.61703 && b/(double)a < 1.61903){
            System.out.println("золото");
            return true;}
        else if (a == c && (double)c/b > 1.61703 && (double)c/b < 1.61903){
            System.out.println("золото");
            return true;}
        else
            return false;
        }

    public static void main(String[] args) {
        isGoldenTriangle(89, 55, 55);
    }
    }

