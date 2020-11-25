package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
  public static int sumBits(byte value){
      int result = 0;
      for (int i = 0; i < 8; i++){
          result += (value >> i) & 1;
      }
      return result;
  }

        public static void main(String[] args) {
            System.out.println(sumBits((byte) 0b1000_0000));
            System.out.println(sumBits((byte) 0b0111_0000));
            byte i = 127;
            System.out.println(sumBits(i));
            System.out.println(sumBits((byte) 0b0111_1111));
    }
}
