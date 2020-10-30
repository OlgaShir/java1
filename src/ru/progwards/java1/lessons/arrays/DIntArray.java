package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] massiv;

    DIntArray(){
        int[] massiv;
        this.massiv = new int[0];
    }
    public void add(int num){
     int[] massivPlus = Arrays.copyOf(massiv, massiv.length+1);
      massivPlus[massivPlus.length-1] = num;
      this.massiv = massivPlus;
    }
    public void atInsert(int pos, int num){
        int[] massivIns = Arrays.copyOf(massiv, massiv.length+1);
        for (int i = 0; i < massiv.length; i++){
      if (i < pos) {
          massivIns[i] = massiv[i];
      }  else {
          massivIns[i+1] = massiv[i];
      }
        }
        massivIns[pos] = num;
        this.massiv = massivIns;
    }
    public void atDelete(int pos){
        int[] massivDel = new int[massiv.length - 1];
        for (int i = 0; i < massivDel.length; i++){
            if (i < pos) {
                massivDel[i] = massiv[i];
            }  else {
                massivDel[i] = massiv[i+1];
            }
        }
        this.massiv = massivDel;
    }
    public int at(int pos){
        return  massiv[pos];
    }
        public static void main(String[] args) {

        }
    }

