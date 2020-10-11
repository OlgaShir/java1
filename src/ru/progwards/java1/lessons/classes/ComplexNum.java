package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        if (b >= 0)
        return  a+"+"+b+"i";
        else
            return a+"-"+ -b+"i";
    }
    public ComplexNum add(ComplexNum num) {
        int c;
        int d;
        this.c = c;
        this.d = d;
    }

        public String toString(){
            return (a+c)+"+"+(b+d)+"i";


    }

    public static void main(String[] args) {

    }
}

