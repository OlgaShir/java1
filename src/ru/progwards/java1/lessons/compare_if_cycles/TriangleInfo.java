package ru.progwards.java1.lessons.compare_if_cycles;

class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        boolean result = (a<(b+c) && b<(a+c) && c<(a+b));
        System.out.println(result);
        return result;
    }
    public static boolean isRightTriangle(int a, int b, int c){
        if((a*a)+(b*b)==(c*c))
            return true;
        else if ((a*a)+(c*c)==(b*b))
            return true;
        else if ((b*b)+(c*c)==(a*a))
            return true;
        else
            return false;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean result1 = (a == b || b == c || c == a);
        System.out.println(result1);
        return result1;
    }

    public static void main(String[] args) {
        isIsoscelesTriangle(3,3,5);
    }
}
