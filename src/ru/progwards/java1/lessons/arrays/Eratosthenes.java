package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;

    public Eratosthenes(int N) {
        boolean sieve[] = new boolean[N];
        Arrays.fill(sieve, true);
        
        private void sift() {
            for (int i = 2; i <= N - 1; i++) {
                if (sieve[i]) {
                    for (int j = 2 * i; j <= N; j += i) {
                        sieve[j] = false;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
    }
}