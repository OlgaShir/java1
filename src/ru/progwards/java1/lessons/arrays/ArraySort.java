package ru.progwards.java1.lessons.arrays;

public class ArraySort {
    public static void sort(int[] a){
        for(int i = a.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( a[j] > a[j+1] ){
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
