package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    public Binary(byte num) {
        public String toString(){
            string s = "";
            while (num > 0){
                s = ((num % 2) == 0 ? "0" : "1") + s;
                num = num / 2;
            }
            return; s;
        }
    }
    public static void main(String[] args){

    }
}
