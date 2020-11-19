package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
  public static int sumBits(byte value){
      int result = 0;

      while (value > 0){
          int quantity = value & 0b00000000_00000000_00000000_00000001;
          result += quantity;
          value >>= 1;
      }
      if (value ==0){
          return 0;
      }
      return result;
  }
}
