package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] massiv;

    DIntArray(){
        int[] massiv;
    }
    public void add(int num){
     int[] massivPlus = Arrays.copyOf(massiv, massiv.length+1);
      massivPlus[massivPlus.length-1] = num;
    }
    public void atInsert(int pos, int num){
        int[] massivIns = Arrays.copyOf(massiv, massiv.length+1);
        for (int i = 0; i < massivIns.length; i++){
      if (i < pos) {
          massivIns[i] = massiv[i];
      }  else {
          massivIns[i+1] = massiv[i];
      }
        }
        massivIns[pos] = num;
    }
    public void atDelete(int pos){
        int[] massivDel = Arrays.copyOf(massiv, massiv.length-1);
        for (int i = 0; i < massivDel.length; i++){
            if (i < pos) {
                massivDel[i] = massiv[i];
            }  else {
                massivDel[i-1] = massiv[i];
            }
        }
    }
    public int at(int pos){
        return  massiv[pos];
    }
    public static void main(String[] args) {

    }
    }
