package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;

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
        return new ComplexNum(this.a + num.a, this.b + num.b);
    }

    public ComplexNum sub(ComplexNum num) {
        a = this.a - num.a;
        b = this.b - num.b;
        return new ComplexNum(a, b);
    }

    public ComplexNum mul(ComplexNum num) {
        int AnsI = (this.a * num.b) + (this.b * num.a);
        int AnsR = (this.a * num.a) - (this.b * num.b);
        ComplexNum Sum = new ComplexNum(AnsR, AnsI);
        return Sum;
    }
    public ComplexNum div(ComplexNum num) {
        int a = (this.a * num.a + this.b * num.b) / (num.a * num.a + num.b * num.b);
        int b = (this.b * num.a - this.a * num.b) / (num.a * num.a + num.b * num.b);
        return new ComplexNum (a, b);
    }

    public static void main(String[] args) {

        System.out.println();

    }
}

