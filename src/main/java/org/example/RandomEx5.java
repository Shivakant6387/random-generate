package org.example;

import java.util.Random;

public class RandomEx5 {
    public static void main(String[] args) {
        randomInts(5);
        randomList(9,50,90);
    }
    public static void randomInts(int num){
        Random random=new Random();
        random.ints(num).forEach(n-> System.out.println(n));
    }
    public static void randomList(int num,int origin,int bound){
        Random random=new Random();
        random.ints(num,origin,bound).forEach(n-> System.out.println(n));
    }
}
