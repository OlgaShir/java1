package ru.progwards.java1.lessons.compare_if_cycles;

class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
        if (a>b && a>c)
        return a;
        else if (b>a && b>c)
        return b;
        else
        return c;
    }
    public static int minSide(int a, int b, int c){
        if (a<b && a<c)
            return a;
        else if (b<a && b<c)
            return b;
        else
            return c;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
        boolean result = (a==b && b==c);
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        isEquilateralTriangle(1,2,3);
    }
}
