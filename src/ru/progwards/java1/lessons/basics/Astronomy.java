package ru.progwards.java1.lessons.basics;

public class Astronomy {

            public static Double sphereSquare(Double r){
                double s = 4.0 * Math.PI * (r * r);
                return s;
            }
            public static Double earthSquare() {
                double s1 = sphereSquare(6371.2);
                return s1;
            }
            public static Double mercurySquare() {
                double s2 = sphereSquare(2439.7);
                return s2;
            }
            public static Double jupiterSquare() {
                double s3 = sphereSquare(2439.7);
                return s3;
            }

            public static Double earthVsMercury(){
                double p = earthSquare()/mercurySquare();
                return p;
            }

            public static Double earthVsJupiter() {
                double p1 = earthSquare() / jupiterSquare();
                return p1;
            }
                public static void main(String[]args){
                    sphereSquare(6371.2);
                    sphereSquare(2439.7);
                    sphereSquare(71492.0);
                }
            }