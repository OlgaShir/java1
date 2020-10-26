package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] massiv;

    DIntArray(int[] massiv);

    public void add(int num){
     int[] massivPlus = Arrays.copyOf(massiv, massiv.length+1);
      massivPlus[massivPlus.length-1] = num;
    }

    }
