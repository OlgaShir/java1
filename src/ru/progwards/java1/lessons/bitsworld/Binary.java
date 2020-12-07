package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;
    public Binary(byte num) {
        this.num = num;
    }
        public String toString(){
            String result = "";
            for (int i = 0; i < 8; i++){
                result = (num & 0b1) + result;
              num >>= 1;
            }
            return result;
        }
    public static void main(String[] args){

    }
}